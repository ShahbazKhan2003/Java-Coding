

public class MethodOverloading {
    public static int sum(int a , int b){
        return a +b;
    }
    public static int sum(int a , int b , int c){
        return a + b + c;
    }
    public static String sum(String a , String b){
        return a + b;
    }
    public static void sum(double a , double b){
        System.out.println( a + b);
    }
    public static void main(String[] args) {
        System.out.println(sum(5,10));
        System.out.println(sum(5,10 ,15));
        System.out.println(sum("10" , "10"));
        sum(9.0 , 10.0);
    }
}
