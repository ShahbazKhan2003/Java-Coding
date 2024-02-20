import java.util.Scanner;

public class TransactionFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int trxFee = sc.nextInt();

        int obsp = -arr[0];
        int ossp = 0;
        for(int i=1;i<arr.length;i++){
            int nbsp = 0;
            int nssp = 0;
//buying k liye
            if(ossp - arr[i] > obsp) nbsp = ossp - arr[i];
            else nbsp = obsp;
//Selling k liye
             if(obsp + arr[i] - trxFee > ossp) nssp = obsp + arr[i] - trxFee;
             else nssp = ossp;
             
             obsp = nbsp;
             ossp = nssp;
        } 
        System.out.println(ossp);
    }    
}
