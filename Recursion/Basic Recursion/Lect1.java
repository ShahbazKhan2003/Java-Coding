import java.net.SocketTimeoutException;
import java.util.*;

public class Lect1 {
    // Factorial
    // public static void main(String[] args) {
    // int n = 59;
    // System.out.println(fact(n));
    // }
    // public static int fact(int n)
    // {
    // if(n == 0) return 1;
    // int fn = fact(n-1);
    // return fn*n;
    // }

    // Print 1 to N
    // public static void main(String[] args)
    // {
    // int n = 5;
    // printInc(n);
    // }
    // public static void printInc(int n)
    // {
    // if(n == 1)
    // {
    // System.out.println(n);
    // return;
    // }

    // printInc(n-1);
    // System.out.println(n);
    // }

    // Print N to 1
    public static void main(String[] args) {
        int n = 4;
        printInc(n);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printInc(n - 1);
    }
}
