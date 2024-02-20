import java.util.Scanner;

public class CountPalindromicSub {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.next();

        int[][] dp  = new int[s.length()][s.length()];

        for(int g=0;g<dp.length;g++){
            for(int i=0,j=g;j<dp.length;i++,j++){
                if(g==0) dp[i][j] = 1;

                else if(g==1){
                    if(s.charAt(i) == s.charAt(j)) dp[i][j] = 3;
                    else dp[i][j] = 2;
                }
                else{
                    if(s.charAt(i)== s.charAt(j)){
                        dp[i][j] = dp[i][j-1] + dp[i+1][j]  + 1;
                    }
                    else{
                        dp[i][j] = dp[i][j-1] + dp[i+1][j]  - dp[i+1][j-1];
                    }
                }
            }
        }
        System.out.println(dp[0][dp.length-1]);
        
    }
    
}
