class A{
    int a = 20;
    void methodA(){
        System.out.println("Method A");
    }
}
class B extends A{
    int a = 100;
    void methodA(){
        System.out.println("Method B");
    }
}
class C extends B{
    // int a = 90;
    void methodC(){
        System.out.println("Method C");
    }
}
public class MultiLevel{
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        System.out.println(obj.a);
    }
}