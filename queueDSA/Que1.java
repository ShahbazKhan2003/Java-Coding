import java.util.*;
public class Que1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> helpq = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        int n  = q.size();
        for(int i =0;i<n;i++)
        {
            helpq.add(q.peek());
            System.out.println(q.remove());
        }
        System.out.println(helpq);
        
        

    }
}
