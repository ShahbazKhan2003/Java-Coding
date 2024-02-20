import java.util.Scanner;

public class SubsetPartition {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int k = sc.nextInt();

         if(n==0 || k==0 || n < k) System.out.println(0);     //Zero ways

         int[][] dp = new int[k+1][n+1];

         for(int i=1;i<=k;i++){                         //no of partitions
            for(int j=1;j<=n;j++){                      // i= total no.
                if(j < i) dp[i][j] = 0;                 //no he chota hai partition se

                else if(j == i) dp[i][j] = 1;            //n=12 k=2 , ans = 1; 1 he tarika hai 1,2

                else{
                    dp[i][j] = dp[i-1][j-1] + dp[i][j-1]*i;      //1234 ,k=3  123(3) * i +  123(2)
                }
            }
         }
         System.out.println(dp[k][n]);
    }    
}
