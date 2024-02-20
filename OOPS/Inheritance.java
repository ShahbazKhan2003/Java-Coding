class P
{
    int d  = 1;
    int d1 = 10;

    public void func()
    {
        System.out.println("this is P");
    }
    public void func1()
    {
        System.out.println("This is also P");
    }
}
class C extends P
{
    int d = 2;
    int d2 = 20;
    public void func()
    {
        System.out.println("THis is C");
    }
    public void func2()
    {
        System.out.println("This is also C");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        //Inheritance has 4 cases
        
        //case1    (reference and object is same)
        // P obj = new P();
        // System.out.println(obj.d);
        // System.out.println(obj.d1);
        // System.out.println(obj.d2); (run time cant access it to C class so it give compile error)
        // obj.func();
        // obj.func1();
        //obj.func2();

        // Case2 ( reference = P & obj = C)         (variable dont hai overloading,, Only Functions have)

        P obj = new C();
        System.out.println(obj.d);
        System.out.println(obj.d1);

        // System.out.println(((C)(obj)).d2); //(Typecasting to get C class ele)

        obj.func();
        obj.func1();
        // ((C)(obj)).func2();

        // Case 3 (reference  = Child & obj = Parent)

        // C obj = new P();
        // Not allowed in any lang as parent cant get accesss to child ele

        //Case 4  ( ref = Child & obj = Child)

        // C obj  = new C();

        // System.out.println(obj.d);
        // System.out.println(obj.d1);
        // System.out.println(obj.d2);
        // obj.func();
        // obj.func1();
        // obj.func2();






    }
}
