import java.util.Scanner;

public class oneTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int i=0;i<n;i++){
            if(arr[i] < min) min = arr[i];
            int profit = arr[i] - min;
            ans = Math.max(ans, profit);
        }
        System.out.println(ans);
    }
}
