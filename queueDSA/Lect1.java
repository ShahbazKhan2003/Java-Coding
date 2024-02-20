import java.util.*;
public class Lect1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        //Size of Queue
        System.out.println(q.size());
        System.out.println(q);
        //REmove Ele
        q.remove();
        System.out.println(q);
        //Peek ELE
        System.out.println(q.size());
        System.out.println(q.peek());
        //Check isEmpty
        System.out.println(q.isEmpty());
    }
}
