import java.util.*;
public class SubsetII {
    public static void main(String[] args) {
        int[] arr ={1,2,2};
        subwithoutdup(arr,0,new ArrayList<>() );
    } 
    public static void subwithoutdup(int[] nums,int i,ArrayList<Integer> arr){
        if(i>=nums.length){
            System.out.println(arr);
            return;
        }
        arr.add(nums[i]);
        subwithoutdup(nums, i+1, arr);
        while(i+1 <nums.length && nums[i]==nums[i+1]) i++;
        arr.remove(arr.size()-1);
        subwithoutdup(nums, i+1, arr);
    }   
}

