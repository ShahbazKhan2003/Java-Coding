import java.util.Arrays;
import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] a = new int[len];
        for(int i=0;i<len;i++) a[i] = sc.nextInt();

        for (int i = 0; i < len-1; i++)
        {
            // Find the minimum element in unsorted array
            int min = i;
            for (int j = i+1; j < len; j++)
                if (a[j] < a[min])
                    min = j;

            // Swap the found minimum element with the
            // first element in unsorted part of the array
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
