import java.util.Scanner;

public class BurstBallon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++) nums[i] = sc.nextInt();

        int dp[][] = new int[nums.length][nums.length];
        
        for(int g = 0; g < dp.length; g++){ 
            for(int i = 0, j = g; j < dp.length; i++, j++){
                int max = Integer.MIN_VALUE;
                for(int k = i; k <= j; k++){
                    int left = k == i ? 0 : dp[i][k - 1];
                    int right = k == j ? 0 : dp[k + 1][j];
                    int val = (i == 0 ? 1 : nums[i - 1]) * nums[k] * (j == nums.length - 1 ? 1 : nums[j + 1]);
                    int total = left + right + val;
                    if(total > max) max = total;
                }
                dp[i][j] = max;
            }
        }
         
        System.out.println(dp[0][n-1]);
    }
}
