import java.util.*;

public class Fibo{
    static int call = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        // System.out.println(helper(n,dp));
        helper(n);

        
    }
    // Basic Recursion Approach
    // public static int helper(int n){
    //     if(n==0 || n==1) return 1;
    //     // call++;
    //     return helper(n-1) + helper(n-2);
    // }

    //MEMOZIATION
    // public static int helper(int n,int[]dp){
    //     if(n==0 || n==1) return 1;

    //     if(dp[n]!=-1){
    //         return dp[n];
    //     }
    //     dp[n] = helper(n-1, dp) + helper(n-2, dp);
    //     return dp[n];
    // }
    
    //Tablulation

    public static void helper(int n){
        // int[] dp = new int[n+1];
        // dp[1] = 1;
        // dp[2] = 1;
        // for(int i=3;i<=n;i++){
        //     dp[i] = dp[i-1] + dp[i-2];
        // }
        // System.out.println(dp[n]);
        int curr = 0;
        int p1 = 1;
        int p2= 1;
        for(int i=3;i<=n;i++){
            curr = p1+p2;
            p1 = p2;
            p2 = curr;
        }
        System.out.println(curr);
        
    }
}