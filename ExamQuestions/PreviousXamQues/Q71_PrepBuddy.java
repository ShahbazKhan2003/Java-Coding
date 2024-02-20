import java.util.Scanner;

public class Q71_PrepBuddy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=n;i>=1;i--){
            int val = i;
            int max = Integer.MAX_VALUE;
            
            while(val!=0){
                int r = val%10;
                if(r>max){
                    break;
                }
                max = r;
                val = val/10;
            }
            if(val == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
