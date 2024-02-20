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

// 1st Way to raise exception

    // public void setage(int age) throws Exception
    // {
    //    if(age < 0)
    //    {
    //       throw new Exception("-ve nhi hota hai");
    //    }
    //   this.age=age;
    // }

// 2nd Way

    public void setage(int age) 
    {
        try
        {
            if(age < 0)
            {
                throw new Exception("-ve nhi hota hai be");
            }
            this.age = age;
        }
        catch(Exception e)
        {
            //System.out.println(e);
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Yo yo honey singh");
        }
    }

    public int getage() {
        return this.age;
    }

}

public class ExceptionCreatingandHandling {
    public static void main(String[] args) throws Exception
        {
        Person p = new Person("Karan", 27);
        p.setname("Kumar");
        p.setage(22);
        System.out.println(p.getage() + " " + p.getname());
    }
}
