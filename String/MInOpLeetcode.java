import java.util.Arrays;
import java.util.Scanner;

public class MInOpLeetcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  boxes = sc.next();
        int n = boxes.length();
        int arr[] = new int[n];
        int k=0;
        while(k<n){
            arr[k] = helper(0,n,k,boxes); 
            k++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int helper(int i,int n,int k,String Boxes){
        int ans = 0;
        //Left
        while(i<=k-1){
            if(Boxes.charAt(i)=='1') ans+=k-i;
            i++;
        }
        //RIght
        int st = k;
        k=k+1;
        while(k<=n-1){
            if(Boxes.charAt(k)=='1') ans+= k-st;
            k++;
        }
        System.out.println(ans);
        return ans;
    }
}
