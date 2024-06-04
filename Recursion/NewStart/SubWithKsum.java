public class SubWithKsum {
    static boolean ans = false;
    public static void main(String[] args) {
        int[] arr = {3 , 1, 2};
        int tar = 5;
        subK(arr , 0 , tar , 0);
        System.out.println(ans);
    }
    public static void subK(int[] arr , int idx , int tar , int sum){
        if(sum == tar){
            ans = true;
            return;
        }
        if(idx >= arr.length){
            // System.out.println(sum);
            return;
        }


        int temp = arr[idx];
        sum+=temp;
        subK(arr, idx+1, tar, sum);
        sum-=temp;
        subK(arr, idx+1, tar, sum);
    }
}
