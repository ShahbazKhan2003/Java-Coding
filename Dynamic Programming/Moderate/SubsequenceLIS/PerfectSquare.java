import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;                //Hum dp[i] mei store kr rhe hai kitne possiblity hai uss i number ki with perfect sq

        for(int i=2;i<=n;i++){
            int min = Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                int rem = i-j*j;
                min = Math.min(dp[rem], min); 
            }
            dp[i] = min+1;
        }
        System.out.println(dp[n]);
    }
}
