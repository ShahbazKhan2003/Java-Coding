    import java.util.Scanner;

public class KnapSackZeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for(int i=0;i<n;i++) values[i] = sc.nextInt();
        for(int i=0;i<n;i++) weights[i] = sc.nextInt();

        int tar = sc.nextInt();

        int[][] dp = new int[n+1][tar+1];

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){

                if(j>=weights[i-1]){ 
                    int rcap = j-weights[i-1];
                    if(dp[i-1][rcap] + values[i-1] > dp[i-1][j]){
                        dp[i][j] = dp[i-1][rcap] + values[i-1];
                    }
                    else dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        System.out.println(dp[n][tar]);

    }
}
