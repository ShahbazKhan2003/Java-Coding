import java.util.*;
public class MultipleTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        
        int buyingday = 0;
        int sellingday = 0;
        int profit = 0;

        for(int i=1;i<n;i++){
            if(arr[i] >= arr[i-1]){                    //jbtk next value bdi hai profit hoga he toh sd++
                sellingday++;
            }
            else{
                profit += arr[sellingday] - arr[buyingday];      //kam mile toh whi profit lo aur 
                buyingday = sellingday = i;
            }
        }
        profit += arr[sellingday] - arr[buyingday];                //for last if there is no dip
        System.out.println(profit);
    }
}
