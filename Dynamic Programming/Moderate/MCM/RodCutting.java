import java.util.Scanner;

public class RodCutting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        //0th index store 1 rod cut so make it clear i make a new array to shift it in 1st index
        int[] np = new int[n+1];
        for(int i=0;i<n;i++) np[i+1] = arr[i];
        
        int[] dp = new int[np.length];             //dp[i] = store max value u get when u cut that length
        dp[0] = 0;
        dp[1] = np[1];

        for(int i=2;i<dp.length;i++){
            int max = Integer.MIN_VALUE;
            for(int j=1;j<=i/2;j++){
                max = Math.max(max, dp[j]+dp[i-j]);
            }
            dp[i] = Math.max(max, np[i]);
        }
        System.out.println(dp[n]);
        // int ans =0;
        // for(int i:dp) ans = Math.max(ans, i);
        // System.out.println(ans);
    }
}
