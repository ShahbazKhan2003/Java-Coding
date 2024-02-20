import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
         int[] arr = {1,2,3};
         ArrayList<Integer> a = new ArrayList<>();
         subset(arr, 0, a);
         int tar =3;
        //  subwithtar(arr,0,a,tar); 
    }    
    public static void subset(int[] nums,int i,ArrayList<Integer> arr){
        if(i >= nums.length){
            System.out.println(arr);
            return;
        }
        arr.add(nums[i]);
        subset(nums, i+1, arr);
        arr.remove(arr.size()-1);
        subset(nums, i+1, arr);
    }
    public static void subwithtar(int[] nums,int i,ArrayList<Integer> arr,int tar){
        if(i>=nums.length){
            int sum=0;
            for(int k:arr){
                sum+=k;
            } 
            if(sum==tar) System.out.println(arr);
            return;
        }
        arr.add(nums[i]);
        subwithtar(nums, i+1, arr, tar);
        arr.remove(arr.size()-1);

        subwithtar(nums, i+1, arr, tar);
    }

}
