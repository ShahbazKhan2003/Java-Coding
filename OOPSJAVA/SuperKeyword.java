class Parent{
    Parent(){
        System.out.println("Constructor calling Parent");
    }
    String color = "Blue";
    void eat(){
        System.out.println("Eating");
    }

}
class Child extends Parent{
    String color = "Dark";
    Child(){
        super();
        System.out.println("Child constructor");
    }
    public void superInVariable(){
        System.out.println(color);
        System.out.println(super.color);
    }

    public void eat(){
        System.out.println("Done with eating");
    }
    public void bark() { System.out.println("Barking");};

    public void superinMehthods(){
        eat();
        super.eat();
        bark();
    } 


}
public class SuperKeyword {
    public static void main(String[] args) {
        Child obj = new Child();
            // obj.superInVariable();
            // obj.superinMehthods();

    }
}
