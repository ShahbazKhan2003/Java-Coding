import java.util.*;

public class CombinationSumII {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        Arrays.sort(arr);
        int tar = 2;
        Csum(arr,0,tar,0,new ArrayList<>());
    }
    public static void Csum(int[] nums,int i,int tar,int sum,ArrayList<Integer> arr){

        if(sum == tar){
            System.out.println(arr);
            return;
        }
        if(sum>tar) return;
        if(i>=nums.length) return;

        sum+=nums[i];
        arr.add(nums[i]);
        Csum(nums, i+1, tar, sum, arr);
        sum-=nums[i];
        arr.remove(arr.size()-1);
        
        while(i+1<nums.length && nums[i] == nums[i+1]) i++;
        Csum(nums, i+1, tar, sum, arr);
    }
}
