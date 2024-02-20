import java.util.Scanner;

public class MaxSumNonAdjacent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
//Using 2d
        // int[][] dp = new int[2][n];

        // dp[0][0] = arr[0]; // Take
        // dp[1][0] = 0;      // Not take

        // for(int i=1;i<n;i++){
        //     dp[0][i] = arr[i] + dp[1][i-1];
        //     dp[1][i] = Math.max(dp[0][i-1], dp[1][i-1]);
        // }
        // int ans = Math.max(dp[0][n-1], dp[1][n-1]);
        // System.out.println(ans);

        int take = arr[0];
        int not_take = 0;
        for(int i=1;i<n;i++){
            int include = arr[i]+not_take;
            int exculde = Math.max(not_take, take);

            take = include;
            not_take = exculde;
        }
        System.out.println(Math.max(not_take, take));
    }
}
