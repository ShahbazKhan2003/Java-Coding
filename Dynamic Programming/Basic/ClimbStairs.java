import java.util.*;
public class ClimbStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Memo
        System.out.println(climb(n,new int[n+1]));
        //Tabu
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2;i<=n;i++){
            arr[i] = arr[i-1] + arr[i-2]; 
        }
        System.out.println(arr[n]);
    }
    public static int climb(int n,int dp[]){
        if(n==0 || n==1) return 1;
        if(dp[n]!=0) return dp[n];
        int l = climb(n-1, dp);
        int r = climb(n-2, dp);
        return dp[n] = l+r;
    }
}
