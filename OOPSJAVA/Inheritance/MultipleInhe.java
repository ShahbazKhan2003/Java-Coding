class A{
    void show(){
        System.out.println("nope");
    }
}
class B {
    void show(){
        System.out.println("nope");
    }
}
class C extends A,B{
    void show(){
        System.out.println("nope");
    }
}
public class MultipleInhe {
    public static void main(String[] args) {
        C obj = new C();
        // Not supported in java
    }
}
