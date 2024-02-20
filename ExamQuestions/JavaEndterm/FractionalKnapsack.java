import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxw = sc.nextInt();

        int[] val = new int[n];
        for(int i=0;i<n;i++) val[i] = sc.nextInt();
        int[] wgt = new int[n];
        for(int i=0;i<n;i++) wgt[i] = sc.nextInt();

        Integer[][] arr = new Integer[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = val[i];
            arr[i][1] = wgt[i];
        }
        Arrays.sort(arr, (a,b)->{
            double r1  = (double) a[0]/a[1];
            double r2 =  (double) b[0]/b[1];
            return Double.compare(r2,r1);
        });
        double ans = 0.0;
        int currW = 0;

        for(int i=0;i<n;i++){
            if(currW + arr[i][1] <= maxw){
                ans+=arr[i][0];
                currW+=arr[i][1];
            }
            else{
                int rem = maxw - currW;
                ans+= (double)arr[i][0]/(double)arr[i][1] * rem;
                break;
            }
        }
        System.out.println( ans);


    }
}
