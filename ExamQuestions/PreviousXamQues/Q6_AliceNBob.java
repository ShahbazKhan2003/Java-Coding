import java.util.*;

public class Q6_AliceNBob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] alice = new int[n];
        int[] bob = new int[n];
        for(int i=0;i<n;i++) alice[i] = sc.nextInt();
        for(int i=0;i<n;i++) bob[i] = sc.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            if(alice[i] > 2*(bob[i]) || bob[i] > 2*(alice[i])) continue;
            else count++;
        }
        System.out.println(count);
    }
}
