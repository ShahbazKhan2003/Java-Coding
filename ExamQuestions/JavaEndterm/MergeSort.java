import java.util.*;
//Stable Algo
//Tc - nlogn
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {7,20,4,11,8,2};
        int n = arr.length;
        mergesort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergesort(int[] arr,int l,int r){
        if(l>=r) return;
        int mid = (l+r)/2;
        
        mergesort(arr, l, mid);
        mergesort(arr, mid+1, r);

        merge(arr,l,mid,r);
    }
    public static void merge(int[] arr,int l,int mid,int r){
        int n1 = mid- l + 1;
        int n2 = r - mid;

        int[] lft = new int[n1];
        int[] rgt = new int[n2];
        for(int i=0;i<n1;i++) lft[i] = arr[l+i];
        for(int j=0;j<n2;j++) rgt[j] = arr[mid+1+j];
        
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(lft[i] < rgt[j]){
                arr[k++] = lft[i++];
            }
            else arr[k++] = rgt[j++];
        }
        while (i<n1) {
            arr[k++] = lft[i++];
        }
        while (j<n2) {
            arr[k++] = rgt[j++];
        }
    }
}
