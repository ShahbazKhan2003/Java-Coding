import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class MergeTwoSortedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int l = n+m;
        int[] arr3 = new int[l];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        printmergesorted(arr1,n,arr2,m,arr3,l);
    }
    public static void printmergesorted(int[] arr1,int n,int[] arr2,int m,int[] arr3,int l)
    {
        int i=0,j=0;
        int k=0;
        while(i < n && j < m)
        {
            if(arr1[i] < arr2[j])
            {
                arr3[k++]= arr1[i++];
            }
            else if(arr1[i] > arr2[j])
            {
                arr3[k++] = arr2[j++];
            }
//for removing the dupls            
            // else
            // {
            //     arr3[k++] = arr2[j];
            //     i++;
            //     j++;
            // }
        }
        while(i<n)
        {
            arr3[k++] = arr1[i++];
        }
        while(j<m)
        {
            arr3[k++] = arr2[j++];
        }
        for(int f=0;f<l-1;f++)
        {
            System.out.print(arr3[f]+" ");
        }
    }
}
