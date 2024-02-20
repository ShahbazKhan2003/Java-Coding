import java.util.Scanner;

public class PalindronePartioningMIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean[][] dp = new boolean[s.length()][s.length()]; // It stores string is palind or not
        for(int g=0;g<dp.length;g++){
            for(int i=0,j=g;j<dp.length;i++,j++){
                if(g==0) dp[i][j] = true;        // It a single char so it is palin
                else if(g==1){
                    if(s.charAt(i) == s.charAt(j)) dp[i][j] = true;  // if 2 digit then check first and last char
                    else dp[i][j] = false;                        
                }
                else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1] == true) dp[i][j] = true;
                    else dp[i][j] = false;     //let abba check first first and last digit and then remaining
                }
            }
        }
        int[][] ans = new int[s.length()][s.length()];

        for(int g=0;g<ans.length;g++){
            for(int i=0,j=g;j<ans.length;i++,j++){
                if(g==0) ans[i][j] = 0;

                else if(g==1){
                    if(s.charAt(i)==s.charAt(j)) ans[i][j] = 0;
                    else ans[i][j]  = 1;
                }

                else{
                    if(dp[i][j]==true) ans[i][j] = 0;
                    else{
                        int min = Integer.MAX_VALUE;                        
                        for(int k=i;k<j;k++){                              //abbc - a|bbc , ab|bc , abb|c
                            int lp = ans[i][k];
                            int rp = ans[k+1][j];
                            min  = Math.min(min, lp+rp);
                        }
                        ans[i][j] = 1+min;
                    }
                }
            }
        }
        System.out.println(ans[0][s.length()-1]);

    }
}
