import java.util.Scanner;

public class CoinChangePermutation {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int tar = sc.nextInt();
        
        int[] dp = new int[tar+1];
        dp[0] = 1;

        for(int i=1;i<=tar;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j] <= i){
                    int val = i - arr[j];
                    dp[i] += dp[val];
                }
            }
        }
        System.out.println(dp[tar]);
    }
}
