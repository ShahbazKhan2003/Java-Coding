import java.util.Scanner;

public class subarray_Product_lessthanK {
//Variable SLiding window
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int k= sc.nextInt();
        
        int store=countofsubarray(arr,k);
        System.out.println(store);

    }
    public static int countofsubarray(int[] arr,int k) {
        int si=0;
        int ei=0;
        int ans=0;
        int p=1;
        while(ei<arr.length)
        {
            p*=arr[ei];

            while(p>=k && si<=ei)
            {
                p=p/arr[si];
                si++;
            }
            ans= ans+ (ei-si+1);
            ei++;
        }
        return ans;
    }
}
