import java.util.Arrays;
import java.util.Scanner;

public class MinimumCoinTOmakeTar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int tar = sc.nextInt();

        int[] dp = new int[tar+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=arr[i];j<dp.length;j++){
                if(dp[j-arr[i]] != Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j], dp[j-arr[i]]+1);
                }
            }
        }
        if(dp[tar] != Integer.MAX_VALUE) System.out.println(dp[tar]);
        else System.out.println(-1);
    }
}
