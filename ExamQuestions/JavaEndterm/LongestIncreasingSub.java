import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int[] dp = new int[n];
        dp[0] = 1;
        int ans = 0;
        for(int i=1;i<n;i++){
            int max = 0;
            for(int j=0;j<i;j++){
                if(arr[j] < arr[i]) max = Math.max(max,dp[j]);
            }
            dp[i] = 1 + max;
            ans = Math.max(ans,dp[i]);
        }
        System.out.println(ans);

    }
}
