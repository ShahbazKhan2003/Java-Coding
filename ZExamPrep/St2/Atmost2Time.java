import java.util.*;

public class Atmost2Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int i=0;
        int count =1;
        for(int j=1;j<n;j++){
            if(arr[i] != arr[j]){
                for(int k=0;k<count && k<2;k++) System.out.print(arr[i]+" ");
                i=j;
                count=1;
            }
            else{
                count++;
            }
        }
        for(int k=0;k<count && k<2;k++) System.out.print(arr[n-1]+" ");
    }
}
