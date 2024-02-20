import java.util.*;

public class Max3subArraysum {
    public static void main(String[] args) {
        int[] arr = {1,2,7,5,11,3,2,1};
        int k =3;                      //Window Size
        int sum = 0;
//1st way
        //First window create
        // for(int i =0;i<k;i++)
        // {
        //     sum+=arr[i];
        // }
        // int ans = sum;
        // //Window Grow
        // for(int i =k;i<arr.length;i++)
        // {
        //     sum+=arr[i];
        //     sum -= arr[i-k];
        //     //Update
        //     ans = Math.max(ans,sum);
        // }
        // System.out.println(ans);

// 2nd Way
        int ans = 0;
        int si = 0;
        int ei = 0;
        while(ei < arr.length)
        {
            sum += arr[ei];
            //Window Create
            if((ei-si+1) < k) ei++;

            //Window Grow
            else if((ei-si+1) == k)
            {
                //Update
                ans = Math.max(ans,sum);
                sum-=arr[si];
                si++;
                ei++;
            }


        }
        System.out.println(ans);

    }
    
}

