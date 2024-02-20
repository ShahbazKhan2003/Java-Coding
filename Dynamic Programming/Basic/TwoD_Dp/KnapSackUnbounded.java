import java.util.Scanner;

public class KnapSackUnbounded {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for(int i=0;i<n;i++) values[i] = sc.nextInt();
        for(int i=0;i<n;i++) weights[i] = sc.nextInt();

        int tar = sc.nextInt();

        int[] dp = new int[tar+1];
//Using Combination
        for(int i=0;i<n;i++){
            for(int j=weights[i];j<dp.length;j++){
                dp[j] = Math.max(dp[j-weights[i]]+values[i], dp[j]);
            }
        }
        
        System.out.println(dp[tar]);

//Using Permutation
        // for(int i=1;i<dp.length;i++){
        //     for(int j=0;j<n;j++){
        //         if(i>=weights[j]){
        //             dp[i] = Math.max(dp[i] , values[j] + dp[i-weights[j]]);
        //         }
        //     }
        // }
        // System.out.println(dp[tar]);
   

    }
}
