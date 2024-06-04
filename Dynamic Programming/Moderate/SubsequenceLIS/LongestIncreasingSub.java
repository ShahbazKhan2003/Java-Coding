
public class LongestIncreasingSub{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int[] dp = new int[n];
        dp[0] = 1;
        
        for(int i=1;i<n;i++){
            int max = 0;
            for(int j=0;j<i;j++){                       // 0 se i tk dekho koi bda hai, hai toh  uski value lelo
                if(arr[i] > arr[j]){
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max+1;
        }
        int ans = 0;
        for(int i=0;i<n;i++) ans = Math.max(ans, dp[i]);
        System.out.println(ans);
    }

}