
import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) arr[i][j] = sc.nextInt();
        }

        int[][] dp = new int[n][m];

        for(int j=m-1;j>=0;j--){
            for(int i=0;i<n;i++){
                //Last col mei no digging
                if(j==m-1){
                    dp[i][j] = arr[i][j];
                }
                //First row pr 2 dig possible
                else if(i==0){
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], dp[i+1][j+1]) ;
                }
                //Last row pr 2 dig possible
                else if(i == n-1){
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1] , dp[i-1][j+1]);
                }
                //Middle position hai toh 3 travel possible
                else{
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1] , Math.max(dp[i+1][j+1], dp[i-1][j+1]));
                }
            }
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            ans = Math.max(ans, dp[i][0]);
        }
        System.out.println(ans);
    }
}
