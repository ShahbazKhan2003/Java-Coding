import java.util.Scanner;

public class subarray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // SubarrayPrint

        for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
        for (int k = i; k <= j; k++) {
        System.out.print(arr[k] + " ");
        }
        System.out.println();
        }
        }

        // Subarray sum

        // int max = 0;
        // int maximum = Integer.MIN_VALUE;
        // for (int i = 0; i < n; i++) 
        // {    
        //     max = max + arr[i];
        //     if (max > maximum) {
        //         maximum = max;
        //     }
        //     if (max < 0) {
        //         max = 0;
        //     }
        // }

        // System.out.println(maximum);

    }
}
