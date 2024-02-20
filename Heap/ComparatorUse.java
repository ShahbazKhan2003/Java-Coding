import java.util.*;
public class ComparatorUse {
    public static class Student{
        String Name;
        Integer rollno;
        Integer Marks;
        public  Student(String Name,Integer rollno,Integer Marks){
            this.Name  = Name;
            this.rollno  = rollno;
            this.Marks  = Marks;
        }
    }
    public static class StudentComparator implements Comparator<Student>{
        int compareTo(Student s1,Student s2){
            if(s1.Marks > s2.Marks) return 1;

            else if(s1.Marks < s2.Marks) return -1;
            
            else return 0;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> p  = new PriorityQueue<>(new StudentComparator());
        Student s1  = new Student("shah",1300,98);
        Student s2  = new Student("ALi",1330,88);
        p.add(s1);
        p.add(s2);
        System.out.println(p);

    }
}
