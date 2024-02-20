
import java.util.*;

public class ArithemeticSlice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int[] dp = new int[n];
        int ans = 0;
        for(int i=2;i<n;i++){
            int diff1 = arr[i] - arr[i-1];
            int diff2 = arr[i-1] - arr[i-2];
            if(diff1==diff2){
                 dp[i] = 1+dp[i-1];
                 ans+=dp[i];
            }
            else dp[i]=0;
        }
        // System.out.println(Arrays.toString(dp));
        
        System.out.println(ans);
    }
}
