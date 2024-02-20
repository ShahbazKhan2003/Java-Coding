import java.util.*;
public class IntersionSort {
    public static void main(String[] args) {
        int arr[] = {8,3,6,5,4,2};
        System.out.println(Arrays.toString(arr));
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void insertionsort(int[] arr){

        for(int i=1;i<arr.length;i++){

            int j = i;

            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];

                arr[j] = arr[j-1];

                arr[j-1] = temp;

                j--;
            }
        }
    }
}
