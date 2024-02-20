import java.util.Scanner;

public class TwoTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();        

//From 1 to N
        int profit = 0;
        int min = arr[0];
        int[] dpfromStart = new int[arr.length];

        for(int i=1;i<n;i++){
            min = Math.min(min, arr[i]);
            profit = Math.max(profit, arr[i]-min);
            dpfromStart[i] = profit;
        }
//From n-1 to 0        
        int lprofit = 0;
        int lmin = arr[n-1];
        int[] dpfromEnd = new int[arr.length];
        for(int i=n-2;i>=0;i--){
            lmin = Math.max(lmin, arr[i]);
            lprofit = Math.max(lprofit, lmin-arr[i]);
            dpfromEnd[i] = lprofit;
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            ans = Math.max(ans, dpfromStart[i]+dpfromEnd[i]);
        }
        System.out.println(ans);
    }
}
