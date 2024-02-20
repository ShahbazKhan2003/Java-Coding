import java.util.Scanner;

public class QMakeEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int flag = 0;

        for(int i =1;i<n;i++){
            if(!ispossible(arr[i],arr[0])){
                flag = 1;
                break;
            }
        }
        if(flag==1) System.out.println("Yes");
        else System.out.println("No");

       
    }

    public static Boolean ispossible(int x, int y) {
        
        while(y!=0){
            int temp = x;
            x = y;
            y = temp%y;
        }
         return x==1;
    }
}
