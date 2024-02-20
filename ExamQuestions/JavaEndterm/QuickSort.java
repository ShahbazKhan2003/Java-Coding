import java.util.*;

public class QuickSort {
    public static void swap(int[] arr,int st,int end){
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {7,13,8,5,10,2,4};

        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quicksort(int[] arr,int st,int end){
        if(st>=end) return;

        int pivot = partition(arr,st,end);
        quicksort(arr, st, pivot-1); 
        quicksort(arr, pivot+1, end ); 
    }
    public static int partition(int[] arr,int st,int end){
        int pivotele = arr[st];
        int countsmall = 0;
        for(int i=st+1;i<=end;i++){
            if(arr[i] < pivotele) countsmall++;
        }
        int pivotindx = st + countsmall;
        swap(arr, st, pivotindx);

        int i=st,j=end;
        while(i<pivotindx && j>pivotindx){
            while (arr[i] < pivotele) i++;
            while(arr[j] > pivotele) j--;
            if(i<pivotindx && j>pivotindx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotindx;
    }
}
