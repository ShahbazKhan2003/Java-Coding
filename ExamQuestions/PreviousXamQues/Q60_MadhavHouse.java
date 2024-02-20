import java.util.*;
public class Q60_MadhavHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int count =0;
        int i =1;
        while(count != n){
            int val = 3*i+2;
            if(val%k!=0){
                System.out.println(val);
                i++;
                count++;
            }
            else i++;
        }

        
    }
}
