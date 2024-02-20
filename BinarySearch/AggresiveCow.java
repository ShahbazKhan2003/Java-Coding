import java.util.Scanner;

public class AggresiveCow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int s =0;
        int e = arr[n-1];
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(ispossible(arr,k,mid)){
                ans = mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        System.out.println(ans);
    }
    public static boolean ispossible(int[] arr,int cow,int mid){
        int cowcount =1;
        int lastcow = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-lastcow >= mid){
                cowcount++;
                lastcow = arr[i];
                
                if(cowcount==cow) return true;
            }
        }
        return false;
    }
}
