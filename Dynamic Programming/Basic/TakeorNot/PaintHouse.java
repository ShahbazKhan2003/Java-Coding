import java.util.Scanner;

public class PaintHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  noOfHouse = sc.nextInt();

        int[][] arr = new int[noOfHouse][3];
        for(int i=0;i<noOfHouse;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // int takeRed = arr[0][0];
        // int takeBlue = arr[0][1];   
        // int takeGreen = arr[0][2];

        // for(int i=1;i<noOfHouse;i++){
        //     int includeRed = arr[i][0] + Math.min(takeGreen, takeBlue);
        //     int includeBlue = arr[i][1] + Math.min(takeGreen, takeRed);
        //     int includeGreen = arr[i][2] + Math.min(takeRed, takeBlue);
            
        //     takeRed = includeRed;
        //     takeBlue = includeBlue;
        //     takeGreen = includeGreen;
        // }
        // int ans = Math.min(takeBlue,Math.min(takeGreen, takeRed));
        // System.out.println(ans);

        int[][] dp = new int[3][noOfHouse];
        dp[0][0] = arr[0][0];
        dp[1][0] = arr[0][1];
        dp[2][0] = arr[0][2];
        
        for(int i=1;i<noOfHouse;i++){
            dp[0][i] = arr[i][0] + Math.min(dp[1][i-1],dp[2][i-1]);
            dp[1][i] = arr[i][1] + Math.min(dp[0][i-1],dp[2][i-1]);
            dp[2][i] = arr[i][2] + Math.min(dp[0][i-1],dp[1][i-1]);
        }

        int min = Math.min(dp[0][noOfHouse-1], Math.min(dp[1][noOfHouse-1],dp[2][noOfHouse-1]));
        System.out.println(min);


    }
}
