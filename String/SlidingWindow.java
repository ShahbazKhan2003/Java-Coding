import java.util.*;

public class SlidingWindow {
    //Fixed Slinding window 
    //Max subarray sum
    public static void main(String[] args) {
        int[] arr = {1,2,7,5,11,3,2,1};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int store=Maximumsum(arr, k);
        System.out.println(store);
    }
    public static int Maximumsum(int[] arr,int k) {
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        } 
        int ans=sum;   
        for(int i=k;i<arr.length;i++)
        {
            sum+=arr[i];
            sum-=arr[i-k];
            ans=Math.max(ans, sum);
        }
        return ans;
    }
}
