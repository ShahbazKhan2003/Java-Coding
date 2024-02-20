import java.util.*;
public class FractionalKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxW = sc.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];

        for(int i=0;i<n;i++) w[i] = sc.nextInt();
        for(int i=0;i<n;i++) v[i] = sc.nextInt();


        Integer[][] arr = new Integer[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = w[i];
            arr[i][1] = v[i];
        }
        Arrays.sort(arr , (a,b)->{
            double r1 = (double)a[1] /  a[0];
            double r2 = (double)b[1] / b[0];
            return Double.compare(r2, r1);
        });
;
        int curr = 0;
        double ans = 0.0;

        for(int i=0;i<n;i++){
            if(curr + arr[i][0] <= maxW){
                ans+=arr[i][1];
                curr += arr[i][0];
            }
            else {
                int rem = maxW - curr;
                ans+= (double)arr[i][1]/(double)arr[i][0] * rem;
                break;
            }
        }
        System.out.println(ans);
    }
}
