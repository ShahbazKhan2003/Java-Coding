class Parent{
    int age;
    String id;
    static String ceoname;

    public void show(){
        System.out.println(age +" " + id + " " + ceoname);
    }
}
public class StaticKeyword {
    public static void main(String[] args) {
        Parent emp1 = new Parent();
        emp1.age = 21;
        emp1.id = "2100";
        emp1.ceoname = "Khan";
        emp1.show();
        System.out.println();
        Parent emp2 = new Parent();
        emp2.age = 25;
        emp2.id = "1300";
        emp2.ceoname = "Khan";
        emp2.ceoname = "Ali";
        emp2.show();
    }
}
