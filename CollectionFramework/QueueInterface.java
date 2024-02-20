import java.util.*;
public class QueueInterface {

    public static void priorityQueueExample(){
        // PriorityQueue<Integer> p = new PriorityQueue<>();  //Min Pq(By default) - jo min hota hai woh peek/first ele hai
        PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder()); //Max PQ vice versa

        p.offer(10);
        p.offer(5);
        p.offer(7);
        p.add(100);
        p.remove();
        System.out.println(p);
        System.out.println(p.peek());
        p.poll();
        System.out.println(p);
        System.out.println(p.isEmpty());
        System.out.println(p.size());
        System.out.println(p.peek());
    }
    public static void main(String[] args) {
        QueueExample();
        // priorityQueueExample();
        // DequeExample();
    }

    public static void QueueExample(){
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.add(10);

        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.peek());
        q.offerLast(100);
        q.offerFirst(200);
        System.out.println(q);
        q.pollFirst();
        q.pollLast();
        System.out.println(q);
    }
    public static void DequeExample(){
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(10);
        dq.offerFirst(20);
        dq.offer(30);
        dq.offerLast(40);
        System.out.println(dq);
        System.out.println(dq.peek());
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq);
    }
}
