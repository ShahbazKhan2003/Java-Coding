import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7,5,4,1,3};

        for(int i=1;i<arr.length;i++){
            
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--; 
            }
        }
        System.out.println(Arrays.toString(arr));
        //Tc best -0(n) nd  worst - 0(n^2);
        //Stable Sort
        
    }
}
