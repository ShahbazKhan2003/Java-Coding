import java.util.Arrays;
import java.util.Scanner;

public class SortPCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        // System.out.println(Arrays.toString(arr));
        int cp = 0;
        int cc = 0;
        int cm = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == 'P') cp++;
            else if(arr[i] == 'C') cc++;
            else cm++;
        }
        while(cp!=0){
            System.out.println("P");
            cp--;
        }
         while(cc!=0){
            System.out.println("C");
            cc--;
        }
         while(cm!=0){
            System.out.println("M");
            cm--;
        }
    }
}
