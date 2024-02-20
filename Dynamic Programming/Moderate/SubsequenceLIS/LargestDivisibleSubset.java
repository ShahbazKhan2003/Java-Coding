import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LargestDivisibleSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int[] dp = new int[n];
        dp[0] = 1;

        for(int i=1;i<n;i++){
            int max = 0;
            for(int j=0;j<i;j++){
                if(arr[i]%arr[j] == 0 || arr[j]%arr[i] == 0){
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max+1;
        }
        int ans = 0;
        for(int i=0;i<n;i++) ans = Math.max(ans, dp[i]);
        System.out.println(ans);
        
        int prev = -1;
        List<Integer> l = new ArrayList<>();
        for(int i=dp.length-1;i>=0;i--){
            if(dp[i]==ans && (prev==-1 || prev%arr[i]==0)){
                l.addFirst(arr[i]);
                ans--;
                prev= arr[i];
            }
        }
        System.out.println(l);
    }
}
