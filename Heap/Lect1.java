import java.util.*;
public class Lect1 {
    public static void main(String[] args) {
        // PriorityQueue<Integer> p = new PriorityQueue<>(); //MIn heap create
        // PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());  //Max heap
        // p.add(10);
        // p.add(20);
        // p.add(30);
        // p.add(5);
        // p.add(15);
        // System.out.println(p);
        // System.out.println(p.peek());
        // System.out.println(p.isEmpty());
        // System.out.println(p.size());
        // System.out.println(p.remove());
        // System.out.println(p);
        // System.out.println(p.contains(10));
        // int[] arr = {90,2,1,23,50};
        // PriorityQueue<Integer> sort  = new PriorityQueue<>();
        // for(int i=0;i<arr.length;i++) sort.add(arr[i]);
        // int n = sort.size();
        // for(int i=0;i<n;i++){
        //     System.out.print(sort.remove()+" ");
        // }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            return b-a;
        });
        for(int i=10;i<=20;i++) pq.add(i);
        System.out.println(pq);
        
    }
}
