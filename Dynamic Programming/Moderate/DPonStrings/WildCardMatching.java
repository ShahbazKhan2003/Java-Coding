import java.util.*;
public class WildCardMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String pattern = sc.next();

        boolean[][] dp = new boolean[pattern.length()+1][str.length()+1];

        for(int i=dp.length-1;i>=0;i--){
            for(int j=dp[0].length-1;j>=0;j--){
                if(i==dp.length-1 && j==dp[0].length-1) dp[i][j] = true;
                
                else if(i==dp.length-1) dp[i][j] = false;

                else if(j==dp[0].length-1){
                    if(pattern.charAt(i)=='*') dp[i][j]= dp[i+1][j];
                    else  dp[i][j] = false;
                }

                else {
                    //Agar char ? hai toh diagonal dekho
                    if(pattern.charAt(i) == '?') dp[i][j] = dp[i+1][j+1];

                    else if(pattern.charAt(i) == '*'){          // * hai toh aage niche k or krdo bss
                        dp[i][j] =  (dp[i+1][j] || dp[i][j+1]);
                    }
                    //same char hai toh bacha hua check kro diagonal mei
                    else if(pattern.charAt(i) == str.charAt(j)) dp[i][j] = dp[i+1][j+1];
                    //agar char == nhi toh false bhar do sidhe
                    else dp[i][j] = false;
                }
            }
        }

        System.out.println(dp[0][0]);
        
        
    }
}
