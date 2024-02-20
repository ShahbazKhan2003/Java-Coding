import java.util.*;
public class MatrixChainMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();  //A=(10,20) B=(20,30) ... E(50,60) 
  
        int[][] dp = new int[n-1][n-1];
        
        //Gap Rule == i and j in row n col if(gap =0 , gap =1 ,and gap>1)

        for(int gap =0;gap<dp.length;gap++){
            for(int i=0,j=gap;j<dp.length;i++,j++){
                if(gap==0){
                    dp[i][j] = 0;       //diagonal ko 0 krdo as A ko A bnane k liye nothing is required
                }
                else if(gap==1){
                    dp[i][j] = arr[i]*arr[j]*arr[j+1];
                }
                else{
                    int min = Integer.MAX_VALUE;
                    for(int k=i;k<j;k++){
                        //lf = i se k+1,  rf = k+1 se j
                        int lf = dp[i][k];
                        int rf = dp[k+1][j];
                        int mf = arr[i] * arr[k+1] * arr[j+1];
                        int tc = lf + rf + mf;
                        min = Math.min(min, tc);
                    }
                    dp[i][j] = min;
                }
            }
        } 
        System.out.println(dp[0][dp.length-1]);


    }
}
