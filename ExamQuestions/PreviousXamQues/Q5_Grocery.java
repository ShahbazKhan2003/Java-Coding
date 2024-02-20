import java.util.*;

public class Q5_Grocery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();

            int x = sc.nextInt();

            int[] fresh = new int[total];
            int[] value = new int[total];
            int index = -1;

            for(int i=0;i<total;i++) fresh[i] = sc.nextInt();
            for(int i=0;i<total;i++) value[i] = sc.nextInt();

            for(int i=0;i<total;i++){
                if(fresh[i]>x) index = i; 
            }

            System.out.println(value[index]);

         
    }
}
