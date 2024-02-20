import java.util.*;

public class SeletionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,8};
        int n = arr.length;
        for(int i=0;i<n-1;i++){

            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[i]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            
        }
        System.out.println(Arrays.toString(arr));

        //TC - 0(n^2) for all cases
        //Not Stable sort
        //Inplace Algo
    }
}
