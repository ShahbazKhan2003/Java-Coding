import java.util.Scanner;

public class ArrangeBuilding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//Extra Space
        // int[][] dp = new int[2][n+1];
        // dp[0][1] = 1;   //Building
        // dp[1][1] = 1;  //Space

        // for(int i=2;i<dp[0].length;i++){
        //     dp[0][i] = dp[1][i-1];
        //     dp[1][i] = dp[1][i-1] + dp[0][i-1];
        // }
        // int total = dp[1][n] + dp[0][n];
        // System.out.println(total);
        // int bothsideroad = total*total;
        // System.out.println(bothsideroad);

//Using constant space
        int ob = 1;
        int os = 1;
        for(int i=2;i<=n;i++){
            int nb = os;
            int ns = ob + os;

            ob = nb;
            os = ns;
        }
        int ans = ob+os;
        System.out.println((ans*ans));
    }
}
