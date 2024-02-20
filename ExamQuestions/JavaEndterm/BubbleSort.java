import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3};
        //har itr mei max ele last mei jata hai
        // 5 ele mei toh 4itr mei 4 aoni shi jagah gye toh 5th automatic shi hoga na
        //j=0;j<n-i 
        //isliye kuki har itr mei 1 ele shi jagah hoga toh next time usse comp ku krna
        for(int i=1;i<=arr.length-1;i++){
            for(int j=0;j<arr.length-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        //TC worst - 0(n^2)
        //TC best  - 0(n)          by using boolean flag as there is no swapping means it sorted//
        //Inplace Algo
        
        //Stable Sort

        //Optmized Approach

        for(int i=1;i<=arr.length-1;i++){
            boolean flag = false;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                    flag = true;
                }
            }
            if (flag==false) {
                break;
            }
        }


        // Stable sort - Mantain the order of duplicacy of element  vice versa for Unstabe sort
         

    }
}
