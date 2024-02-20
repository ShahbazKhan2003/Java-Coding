public class FirstNLastOcc{
    public static void main(String[] args) {
        int[] arr = {2,7,3,3,7,6,3};
        int ans = firstIndex(arr,0,93);
        System.out.println(ans);
    }
    public static int firstIndex(int[] arr,int i,int target){
        if(i==arr.length) return -1;
        if(arr[i]==target) return i;

        int val = firstIndex(arr, i+1, target);
        return val;
    }
    
}