import java.util.Scanner;

public class LongestCommonSub {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s1 = sc.next();       
        String s2 = sc.next();       

        int[][] dp = new int[s1.length()+1][s2.length()+1];

        for(int i=dp.length-2;i>=0;i--){
            for(int j=dp[0].length-2;j>=0;j--){             //Last row and col is 0
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(j);
                if(c1==c2) dp[i][j] = dp[i+1][j+1] + 1;

                else{
                    dp[i][j] =  Math.max(dp[i][j+1], dp[i+1][j]);
                }
            }
        }
        System.out.println(dp[0][0]);


    }
}
