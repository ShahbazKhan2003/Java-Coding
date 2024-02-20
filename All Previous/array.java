import java.util.*;

public class array {
    public static void main(String[] args) {

        // Integer arr[] = {1,2,3,4,5,6,7};
        // Collections.rotate(Arrays.asList(arr), 3);
        // for(int i=0;i<7;i++)
        // {
        // System.out.print(arr[i]);
        // System.out.print(" ");
        // }

        // int arr[]={1,2,3,4,5,6,7};
        // int k=3;
        // for(int i=0;i<k+1;i++)
        // {
        // int temp=arr[0];
        // for(int j=0;j<6;j++)
        // {
        // arr[j]=arr[j+1];
        // }
        // arr[6]=temp;
        // }

        // for(int i=0;i<7;i++)
        // {
        // System.out.print(arr[i]);
        // System.out.print(" ");
        // }

        // int[] arr={10,2,12,21};
        // Arrays.sort(arr);
        // for(int i:arr)
        // {
        // System.out.println(i);
        // }

        // System.out.println(Arrays.toString(arr));

// Rotate n times

    //     int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
    //     int k = 3;
    //     //int n=arr.length;
    //     // int s=0;
    //     // int e=n-1;
    //     int n=nums.length;
    //     int[] num1=new int[n];
    //     for(int i=0;i<n;i++)
    //     {
    //         num1[(i+k)%n]=nums[i];
    //     }   
    //   nums=num1;

    //     for (int i : nums) {
    //         System.out.print(i+" ");
    //     }

//sqrt of a num
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    //  System.out.println((int) Math.sqrt(n));
    // int s=1;
    // int e=n;
    // int ans=0;
    // while(s<=e)
    // {
    //     int mid=(s+e)/2;
    //     if(mid*mid<=n){
    //         ans=mid;
    //         s=mid+1;
    //     }
    //     else{
    //         e=mid-1;
    //     }
    // }

    // System.out.println(ans);

    int[] x = {1,2};
    int n = 2;
     Integer arr[] = new Integer[n];
    for(int i=0;i<n;i++) arr[i] = x[i];

    Arrays.sort(arr,(a,b)->{
        return b-a;
    });
    long ans = 0;
    for(int i=0;i<n;i++){
        ans+=  Math.pow(i-arr[i],2);
    }
    System.out.println(ans);



    }
}