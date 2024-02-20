import java.lang.reflect.Array;
import java.util.*;

public class Lect1 {
    public static void main(String[] args) {
        // Integer arr[] =  {9 ,2,1,3,5,12};
        // System.out.println(Arrays.toString(arr));
        // Arrays.sort(arr,(a,b)->{
        //     return b-a;
        // });
        // System.out.println(Arrays.toString(arr));
        String arr[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,(a,b)->{
            return b.compareTo(a);
        });
        System.out.println("---------------");
        System.out.println(Arrays.toString(arr));
    }
}
