
class Parent{
    private String name;
    private int age ;
    private int rollno;
    Parent(){
        this.name = "Shah";
        this.age = 21;
        this.rollno = 1300;
    }
    public void getter(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollno);
    }
    public void setter(String name , int age , int rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }
}

public class Lect1 {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.setter("Khan" , 20, 1200);
        obj.getter();
    }
}
