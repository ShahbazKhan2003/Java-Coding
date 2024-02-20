import java.util.Scanner;

public class QMikeAndExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(helper(arr, n, 0, k));

    }
    public static int helper(int[] arr,int n,int i,int k){
        if(i>=arr.length && k!=0) return 0;
        if(k==0) return 1;

         return helper(arr, n, i+1, k) + helper(arr, n, i+1, k-arr[i]) + helper(arr, n, i+1, k+arr[i]);
    }

   
}
