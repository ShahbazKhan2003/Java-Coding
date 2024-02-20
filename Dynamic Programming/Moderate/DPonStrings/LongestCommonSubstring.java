import java.util.Scanner;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1  = sc.next();
        String s2 = sc.next();

        int[][] dp = new int[s1.length()+1][s2.length()+1];
        int ans = 0;

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                char c1 = s1.charAt(i-1);
                char c2 = s2.charAt(j-1);
                if(c1==c2){
                    dp[i][j] = 1+dp[i-1][j-1];
                    ans = Math.max(ans,dp[i][j]);
                }
                else dp[i][j] = 0;
            }
        }

        System.out.println(ans);

    }
}
