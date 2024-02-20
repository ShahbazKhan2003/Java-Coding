import java.util.*;

public class Heapify {
    public static void main(String[] args) {
        int[] arr = {34,23,89,100,5,10};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i:arr) pq.add(i);
        System.out.println(pq);
       
    }
}
