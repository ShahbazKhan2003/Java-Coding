
import java.util.*;
public class HouseRobber {
    public static void main(String[] args) {
        int[] arr  ={9,1,3,8};
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        System.out.println(rob(arr,0,dp));
    }
    public static int rob(int[] arr,int i,int[] dp){
        if(i>=arr.length) return 0;
        if(i==arr.length-1) return arr[i];

        if(dp[i] !=-1) return dp[i];

        int pick = arr[i] + rob(arr, i+2, dp);
        int notpick = rob(arr, i+1, dp);
        
        return dp[i] = Math.max(pick, notpick);
    }
}
