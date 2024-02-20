import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LongestBiotonicSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        //LIS  increasing order mei end hona
        int[] dpLis = new int[n];
        dpLis[0] = 1;

        for(int i=1;i<n;i++){
            int max = 0;
            for(int j=0;j<i;j++){
                if(arr[i] > arr[j]) max = Math.max(max, dpLis[j]);
            }
            dpLis[i] = max+1;
        }
        // System.out.println(Arrays.toString(dpLis));

        //LDS end se decreasing order (uss element se chote ele)
        int[] dpLds = new int[n];
        dpLds[n-1] = 1;

        for(int i=n-2;i>=0;i--){
            int min = 0;
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]) min = Math.max(min, dpLds[j]);
            }
            dpLds[i] = 1+min;
        }

        // System.out.println(Arrays.toString(dpLds));
        int ans = 0;
        for(int i=0;i<n;i++) ans = Math.max(ans, dpLis[i]+dpLds[i]);
        System.out.println(ans-1);
    }
}
