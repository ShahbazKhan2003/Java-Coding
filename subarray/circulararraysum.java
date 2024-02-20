import java.util.*;
import java.util.concurrent.CountDownLatch;

public class circulararraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int nowrap=0;
        int wrap=0;
        int totalsum=0;
        nowrap= kedanealgo(arr,n);
        
        System.out.println(nowrap);

        for(int i=0;i<n;i++)
        {
            totalsum+=arr[i];
            arr[i]=-arr[i];
        }
        System.out.println(totalsum);

        wrap = totalsum - (-kedanealgo(arr, n));
        System.out.println(wrap);
        System.out.println(Math.max(wrap, nowrap));

    }

    public static int kedanealgo(int[] arr,int n)
    {
        int max=0;
        int maximum= Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            max+=arr[i];
            if(max>maximum)
            {
                maximum=max;
            }
            if(max<0)
            {
                max=0;
            }
        }

        return maximum;
    }

}
