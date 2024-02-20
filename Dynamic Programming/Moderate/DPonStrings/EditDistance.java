import java.util.Scanner;

public class EditDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        int[][] dp = new int[s1.length()+1][s2.length()+1];

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0) dp[i][j] = j;

                else if(j==0) dp[i][j] = i;

                else {
                    if(s1.charAt(i-1) == s2.charAt(j-1)){
                        dp[i][j] = dp[i-1][j-1];
                    }
                    else{
                        int f1 = 1 + dp[i-1][j-1];     //replace
                        int f2 = 1 + dp[i-1][j];       //delete
                        int f3 = 1 + dp[i][j-1];       //insert
                        dp[i][j] = Math.min(f3, Math.min(f1, f2));
                    }
                }
            }
        }
        System.out.println(dp[dp.length-1][dp[0].length-1]);
    }
}
