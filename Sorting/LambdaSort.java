import java.util.*;

public class LambdaSort{
    public static void main(String[] args) {
        Integer[] arr = {2, 1, 3, 5};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, (a, b) -> Integer.compare(a, b));

        System.out.println(Arrays.toString(arr));

        }
}