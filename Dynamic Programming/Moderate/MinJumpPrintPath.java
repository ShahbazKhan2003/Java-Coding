import java.util.Scanner;

public class MinJumpPrintPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        
        Integer dp[] = new Integer[n];
        dp[n-1] = 0;

        for(int i=n-2;i>=0;i--){
            int min = Integer.MAX_VALUE;
            for(int j=1;j<=arr[i] && i+j <dp.length;j++){
                if(dp[i+j]!=null && dp[i+j] < min) min = dp[i+j];
            }
            if(min!=Integer.MAX_VALUE) dp[i] = min + 1;
            
        }
        System.out.println(dp[0]);
    }
}
