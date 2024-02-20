import java.util.Scanner;

public class PaintHouseII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  noOfHouse = sc.nextInt();
        int noOfColor = sc.nextInt();
        int[][] arr = new int[noOfHouse][noOfColor];
        for(int i=0;i<noOfHouse;i++){
            for(int j=0;j<noOfColor;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int[][] dp = new int[noOfHouse][noOfColor];
        for(int i=0;i<noOfColor;i++) dp[0][i] = arr[0][i];


        for(int i=1;i<noOfHouse;i++){
            for(int j=0;j<noOfColor;j++){
                int min = Integer.MAX_VALUE;
                for(int k=0;k<noOfColor;k++){
                    if(k!=j){
                        min = Math.min(min, dp[i-1][k]);
                    }
                }
              
                dp[i][j] = arr[i][j] + min;
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<noOfColor;i++){
            ans = Math.min(ans, dp[noOfHouse-1][i]);
        }
        System.out.println(ans);





    }
}
