//Encapsulation is used when we want to change the value in a class but we cant as its private So, we create getter and
//setter to access it and to change it.

class Person {
    private String name = "kirti";
    private int age = 89;

    public void fun() {
        int idno = 9897;
        System.out.println(this.name + " " + this.age + " " + idno);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return this.name;
    }

    public void setage(int age) {
        this.age = age;
    }

    public int getage() {
        return this.age;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Person p = new Person("Karan", 25);
        System.out.println(p.getage() + " " + p.getname());
        p.setname("Kumar");
        p.setage(22);
        System.out.println(p.getage() + " " + p.getname());

    }
}
