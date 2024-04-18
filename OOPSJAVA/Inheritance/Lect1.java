

class P{
    int a = 500;
    int b = 600;
    
    void func(){
        System.out.println("Parent: " + a +" : "+b);
    }
}
class Child extends P{
    int a = 100;
    int b = 200;
    int c = 1000;

    void func(){
        System.out.println("Child : "+a +" : " +b);
    }
}
public class Lect1 {
    public static void main(String[] args) {
        P obj = new P();
        System.out.println(obj);
        obj.func();
    }
}
