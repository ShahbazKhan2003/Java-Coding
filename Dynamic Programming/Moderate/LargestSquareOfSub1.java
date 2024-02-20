import java.util.Scanner;

public class LargestSquareOfSub1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m =scn.nextInt();
		int[][] arr = new int[n][m];
		for(int i = 0 ; i < n; i++){
			for(int j = 0 ; j < m; j++){
				arr[i][j] = scn.nextInt();
			}
		}

        int[][] dp = new int[n][m];
        int ans = Integer.MIN_VALUE;
        
        //4 cases - 1. last row and last col hai toh jo hai dal do 2.last col jo hai dal do 3.last col jo hai dal do 4.-> min of(col+1,row+1 col+1, row) + 1
        for(int i = n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(i==n-1 && j==m-1){             //Last col n last row
                    dp[i][j] = arr[i][j];
                }
                else if(i==n-1){
                    dp[i][j] = arr[i][j];         //Last row
                }
                else if(j==m-1){
                    dp[i][j] = arr[i][j];         //Last col
                }
                
                else{
                    if(arr[i][j] == 0) dp[i][j] = arr[i][j];                  //0 hai toh 0 he aaiga
                              
                    else{                                              //1 hai toh niche , aage, aage niche side mei min dekho +1;
                        dp[i][j] = Math.min(dp[i+1][j] , Math.min(dp[i][j+1], dp[i+1][j+1])) + 1;

                    }
                }
                ans = Math.max(ans, dp[i][j]);
            }
        }

        System.out.println(ans);

    }
}
