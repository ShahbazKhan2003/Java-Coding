// package Problems;

public class CheckEvenOdd {
    public static void main(String[] args) {
        int n = 9;

        int ans = n & 1;
        
        if(ans == 0) System.out.println("Even");
        
        else System.out.println("Odd");
    }
}
