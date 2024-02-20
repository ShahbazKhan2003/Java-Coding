import java.util.Arrays;

public class Kthlargest {
    public static void main(String[] args) {
        int[] arr = {3 ,2 ,3 ,1 ,2 ,4 ,5 ,5,6};

        int k = 4;

        Arrays.sort(arr);
        int n = arr.length;

        System.out.println(arr[n-k]);
    }
}
