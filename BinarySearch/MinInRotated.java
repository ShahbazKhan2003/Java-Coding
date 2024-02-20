

public class MinInRotated {
    public static void main(String[] args) {
        int[] arr = {10,11,12,1,2,3,4,5,6,7};
        int ans = Integer.MIN_VALUE;
        
        int s =  0;
        int e = arr.length-1;

        while(s<=e){
            int mid = s+(e-s)/2;

            if(arr[mid] > arr[e]){
                s=mid+1;
            }
            else if(arr[mid] <= arr[e]){
                ans = arr[mid];
                e=mid-1;
            }
        }
        System.out.println(ans);
    }
}
