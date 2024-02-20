class Person
{
   private String name="Kirti";
   private int age=89;                    //(Private = Person Class k andr he access k skte hai)

//Constructor(Non parameterrized)

    // public Person()
    // {
    //     this.name = "Motu";
    //     this.age = 24;
    // }
//Constructor(Parametrized)
    public Person(String name, int age)
    {
        this.name=name;
        this.age = age;
    }

    public void fun()
    {
        int id_no=900;
        System.out.println( this.name + " " + this.age +" " +id_no);
    }
}


public class Constructor {
    public static void main(String[] args) {
        Person p = new Person("karan",25);
        // p.name = "kaju";
        // p.age =23;
        p.fun();
        Person p1 = new Person("Kumar",24);
        // p1.name = "kunal";
        // p1.age =   45;
        p1.fun();

    }
}
