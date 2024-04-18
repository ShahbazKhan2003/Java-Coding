// package OOPSJAVA;

class LearnConst{
    int id;
    int age;
    LearnConst(int id,int age){
        this.id  = id;
        this.age =age;
        System.out.println("Parameterized Const"); 
    }
    LearnConst(){
        System.out.println("Default Const");
    }
}

class Student{
    int  eid ;
    int salary;
    static String ceo;
    static{
        ceo = "me"; // it will load only once 
    }
    public Student(){
        eid = 1;
        salary = 101;
        // ceo = "unknown"; why intialize at every function call
    }
    public void show(){
        System.out.println(eid+" "+salary+" "+ceo);
    }
}
public class Lect1 {
    public static void main(String[] args) {
        // Student first = new Student();
        // Student second  = new Student();
        // first.eid = 8;
        // first.salary = 5000;
        // first.ceo = "xyz";
        
        // second.eid = 2;
        // second.salary = 2000;
        // second.ceo = "zxc";

        // second.ceo = "shah";
        // Student.ceo = "Khan";
        // first.show();
        // second.show();
        
        LearnConst obj = new LearnConst(1300, 21);


    }
}
