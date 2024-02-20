import java.util.Arrays;
import java.util.Scanner;

public class NonOverlapingInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[][] arr = new Integer[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr,(a,b)->{
            return a[1] - b[1];
        });

        int count =0;
        int end = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i][0] >= end){
                end = arr[i][1];
            }
            else count++;
        }
        System.out.println(count);
    }
}
