import java.util.Arrays;
import java.util.Scanner;

public class MaxNonOverLpaing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        Arrays.sort(arr , (a,b)->{
            if(a[0]== b[0]) return a[1] - b[1];
            else return a[0]-b[0];
        });

        

        int[] dp = new int[n];
        dp[0] = 1;
        for(int i=1;i<n;i++){
            int max = 0;
            for(int j=0;j<i;j++){
                if(arr[i][1] >= arr[j][1]) max = Math.max(max, dp[j]);
            }
            dp[i] = max+1;
        }
        int ans = 0;
        for(int i=0;i<n;i++) ans = Math.max(ans, dp[i]);
        System.out.println(ans);


    }
}