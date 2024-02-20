import java.util.Scanner;

public class BookAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int m = sc.nextInt();

        int sum =0;
        for(int i=0;i<n;i++) sum+=arr[i];
        int s= 0;
        int e=sum;
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(ispossible(arr,mid,m)){
                ans = mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        System.out.println(ans);
    }
    public static boolean ispossible(int[]arr,int mid,int st){
        int stcount=1;
        int page = 0;
        for(int i=0;i<arr.length;i++){
           if(page+arr[i] <= mid) page+=arr[i];
           else{
            stcount++;
            if(stcount>st || arr[i]>mid) return false;
            page = arr[i];
           }
        }
        return true;
    }
}
