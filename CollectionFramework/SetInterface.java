import java.util.*;
public class SetInterface {
    public static void treesetexapmle(){
        TreeSet<Integer> ts = new TreeSet<>();   // Returns Sorted set
        ts.add(9);
        ts.add(10);
        ts.add(2);
        ts.add(8);
        System.out.println(ts.removeFirst());
        System.out.println(ts);
        System.out.println(ts.size());
        ts.remove(8);
        System.out.println(ts.size());
        System.out.println(ts.contains(8));
        ts.remove(10);
        System.out.println(ts);
    }
    public static void main(String[] args) {
        // SetExample();  
        // LinkedsetExample();
        treesetexapmle();
    }
    public static void SetExample(){
        HashSet<Integer> hs = new HashSet<>();   //Unique and Unordered
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(100);
        hs.add(50);
        hs.add(24);
        System.out.println(hs);
        hs.add(1);
        hs.add(2);
        hs.add(1);
        hs.add(2);
        System.out.println(hs.size());
        hs.remove(1);
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.contains(50));
    }
    public static void LinkedsetExample(){
        LinkedHashSet<Integer> lh = new LinkedHashSet<>();  //Ordered n Unique
        lh.add(10);
        lh.add(30);
        lh.add(20);
        lh.add(30);
        System.out.println(lh);
        System.out.println(lh.size());
        lh.remove(10);
        System.out.println(lh);
        System.out.println(lh.size());
        System.out.println(lh.contains(50));
    }
}
