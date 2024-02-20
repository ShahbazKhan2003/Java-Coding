import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

public class homeworkque {
    public static void main(String[] args) {
        // Product of array itself

        // int arr[] = { 1, 2, 3, 4 };
        // int i = 0;
        // while (i < arr.length) {
        // int j = 0;
        // int ans = 1;
        // while (j < arr.length) {
        // if (i == j) {
        // j++;
        // } else {
        // ans = ans * arr[j];
        // j++;
        // }
        // }
        // System.out.print(ans + " ");
        // i++;
        // }

  // optimised approach(POI)

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // int[] left = new int[n];
        // int sum = 1;
        // for (int i = 0; i < n; i++) {
        // left[i] = sum;
        // sum = sum * arr[i];
        // }
        // //System.out.println(Arrays.toString(left));
        // int sum2 = 1;
        // for (int i = n - 1; i >= 0; i--) {
        // left[i] = left[i]*sum2;
        // sum2 = sum2 * arr[i];
        // }
        // System.out.println(Arrays.toString(left));
        
// Rainwater collection

        // Scanner scan = new Scanner(System.in);
        // int n= scan.nextInt();
        // int water=0;

        // int[] arr= new int[1000];
        // int[] left= new int[1000];
        // int[] right= new int[1000];
        // for(int i=0;i<n;i++)
        // {
        // arr[i]=scan.nextInt();
        // }

        // left[0]=arr[0];
        // for(int i=1;i<n;i++)
        // {
        // left[i]=Math.max(left[i-1], arr[i]);
        // }

        // right[n-1]=arr[n-1];
        // for(int i=n-2;i>=0;i--)
        // {
        // right[i]=Math.max(right[i+1], arr[i]);
        // }

        // for(int i=0;i<n;i++)
        // {
        // water+= (Math.min(left[i],right[i])-arr[i]);
        // }
        // System.out.println(water);


 // Next Permutation****
 
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int[] arr = new int[n];

        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // int p = 0;
        // for (int i = n - 2; i >= 0; i--) {
        //     if (arr[i] < arr[i + 1]) {
        //         p = i;
        //         break;
        //     }
        // }
        // System.out.println(p);
        // int q = 0;
        // for (int i = n - 1; i >= 0; i--) {
        //     if (arr[p] < arr[i]) {
        //         q = i;
        //         break;
        //     }
        // }
        // System.out.println(q);

        // int t=arr[p];
        // arr[p]=arr[q];
        // arr[q]=t;

        // System.out.println(Arrays.toString(arr));

        // int s=p+1;
        // int e=n-1;

        // while(s<=e)
        // {
        //     int temp=arr[s];
        //     arr[s]=arr[e];
        //     arr[e]=temp;
        //     s++;
        //     e--;
        // }

        // System.out.println(Arrays.toString(arr));
        

    }
    
}
