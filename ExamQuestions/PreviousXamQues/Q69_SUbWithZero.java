import java.util.ArrayList;
import java.util.Scanner;

public class Q69_SUbWithZero {
    public static void main(String[] args) {
        int[] arr = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> a = new ArrayList<>();
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                a.add(arr[j]);
                sum +=arr[j];
                if(sum==0) System.out.println(a);
            }
        }
        
    }
}
