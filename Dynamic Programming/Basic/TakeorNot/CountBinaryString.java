import java.util.Scanner;

public class CountBinaryString {
    public static void main(String[] args) {
        // Count Bt with no consective 0's
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int[][] dp = new int[2][n+1];
        // dp[0][1] = 1;
        // dp[1][1] = 1;

        // for (int col = 2; col <= n; col++) {
        // dp[0][col] = dp[1][col-1];
        // dp[1][col] = dp[1][col-1] + dp[0][col-1];
        // }

        // Count Bt with no consective 0's

        long[][] dp = new long[2][n + 1];

        dp[0][1] = 1;
        dp[1][1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[0][i] = dp[0][i - 1] + dp[1][i - 1];
            dp[1][i] = dp[0][i - 1];
        }

        System.err.println(dp[0][n] + dp[1][n]);
    }
}