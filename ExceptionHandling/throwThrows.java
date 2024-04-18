// package ExceptionHandling;

public class throwThrows {
    public static void main(String[] args) {
    

        divison(10,0);
    }
    public static void divison(int a , int b) throws ArithmeticException {
        System.out.println(a/b);
    }
}
