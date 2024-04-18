import  java.util.*;
public class LargestSubArrarySumEqtoK{
    public static void main(String[] args) {
        //only for positive numbers

        // int[] arr = {1,2,3,7,5};
        // int k = 12;

        // int i=0,j=0,max=0,sum=0;

        // while(j<arr.length){
        //     sum+=arr[j];
        //     while (sum > k) {
        //         sum-=arr[i];
        //         i++;
        //     }
        //     if(sum < k) j++;

        //     else if(sum==k){
        //         max = Math.max(max, j-i+1);
        //         j++;
        //     }
        // }
        // System.out.println(max);

        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;

        Map<Integer,Integer> h = new HashMap<>();
        int sum = 0, ans =0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            
            if(sum == k) ans = i+1;

            if(!h.containsKey(sum)) h.put(sum, i);

            if(h.containsKey(sum - k)){
                ans = Math.max(ans , i-h.get(sum - k));
            }
        }
        System.out.println(ans);



        
    }
}