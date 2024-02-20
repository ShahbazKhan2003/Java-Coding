import java.util.Scanner;

public class TillingDominoes2N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];       //1st way to fill is previous and next previous  2 * 1 tiles.        }
        }
        System.out.println(dp[n]);
    }
}
