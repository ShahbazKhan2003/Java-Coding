// package Problems;

public class CheckIthBitSet {
    public static void main(String[] args) {
        int n = 13;
        int i = 2;      // 13 = 1 1 0 1  2ith is 1 start from right 0 - 1 - 2

        // while (i>=1) {
        //     n  = n>>1;
        //     i--;
        // }
// Using Or 
        // n = n >> i;
        // int ans = n | 1;
        // if(ans == n) System.out.println("Set");
        // else System.out.println("Not set");

        // n = n >> i;
        // int ans = n & 1;
        // if(ans==1) System.out.println("Set");
        // else System.out.println("Not");

        int mask = 1<<i;
        int val = mask & n;
        if(val == 0) System.out.println("No Set Bit");
        else System.out.println("Set Bit");
    }
}
