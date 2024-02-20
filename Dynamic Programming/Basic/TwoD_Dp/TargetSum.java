
import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int tar = sc.nextInt();

        boolean[][] dp = new boolean[n+1][tar+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=tar;j++){
                //0,0 pr hone pr true he hoga
                if(i==0 && j==0) dp[i][j] = true;
                //first row false he hoge (0 hai)
                else if(i==0) dp[i][j] = false;
                //fist col hai toh sb zero bna he lenge
                else if(j==0) dp[i][j] = true;
                //Mid mei toh 2options 1.he didnt play so check the above row 2.he played than check - val
                else{
                    //1condition check above
                    if(dp[i-1][j] == true) dp[i][j] = true;
                    //2condition check above - val
                    else{
                        int val = arr[i-1];
                        if(j>=val){
                            if( dp[i-1][j-val] == true) dp[i][j] = true;
                        }
                    }
                }
            }
        }
        System.out.println(dp[n][tar]);
    }
}
