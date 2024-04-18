
public class Swap2number {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        
        System.out.println("Before Swap: "+a +" " + b);
        
        a = a^b;
        b = a^b;
        a = a^b;
        
        System.out.println("After Swap:  "+a +" " + b);
    }
}
