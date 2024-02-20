import java.lang.reflect.Array;
import java.util.*;

public class Permutation {
    public static void permstr(StringBuilder s,int pos,ArrayList<StringBuilder> arr ){
        if(pos >= s.length()){
           System.out.println(s);
        }
        for(int i=pos;i<s.length();i++){
           swap1(i, pos, s);
           permstr(s, pos+1, arr);
           swap1(i, pos, s);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        permArr(arr, 0);
        // StringBuilder  s = new StringBuilder("abc");
        // permstr(s,0,new ArrayList<>());
    }

    public static void permArr(int[] nums,int pos){
        if(pos>=nums.length) {
            System.out.println(Arrays.toString(nums));
            return;
        }
        for(int i = pos;i<nums.length;i++){
            swap(i,pos,nums);
            permArr(nums, pos+1);
            swap(i, pos, nums);
        }
    } 
    public static void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void swap1(int i,int j,StringBuilder s){
        char ch = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, ch);

    }
}
