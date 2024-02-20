import java.util.*;

public class StockSpanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
       
        // arr1[0]=1;

        // for(int i=1;i<n;i++)
        // {
        //     arr1[i] = 1;

        //     for(int j = i-1;(j>=0) && (arr[i] >= arr[j]);j--)
        //     {
        //         arr1[i]++;
        //     }
        // }
        // for(int i:arr1)
        // {
        //   System.out.print(i+" ");
        // }

        arr1[0] =1;
        for(int i =1;i<n;i++)
        {
            arr1[i]=1;
            for(int j =i-1;(j>=0) && (arr[i]>=arr[j]);j--)
            {
                arr1[i]++;
            }
        }

        for(int i:arr1)
        {
            System.out.print(i+" ");
        }

    }
}
