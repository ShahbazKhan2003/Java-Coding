interface A{
    public void func();
}
interface B{
    public void func();
    public void func1();
}


class C implements A , B{
    public void func(){
        System.out.println("Ab koi dikkat nhi inertance ki");
    }
    public void func1() { System.out.println("Ye bhi lo");};
}


public class InterfaceForMultiple {
    public static void main(String[] args) {
        C obj  = new C();
        obj.func();
        obj.func1();
    }
}
