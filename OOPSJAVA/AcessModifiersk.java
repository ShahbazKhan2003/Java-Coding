class Parent{
    String name = "xyzk";
    String sex = "O";

}
class child extends Parent{
    String name = "oyu";
    public void printval(){
        System.out.println(super.name);
    }
}
public class AcessModifiersk {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.printval();
        System.out.println(obj.name);
    }
}
