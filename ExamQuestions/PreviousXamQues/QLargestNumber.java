
import java.util.*;

public class QLargestNumber {
    public static void main(String[] args) {
        int[] nums = {54 ,546 ,548 ,60};
        String arr[]  = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
        String ans = "";
        for(String s: arr) ans= ans+s;
        if(ans.startsWith("0")) System.out.println("0");
        else System.out.println(ans);
    }
}
