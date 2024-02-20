import java.util.PriorityQueue;
import java.util.Scanner;

public class SortGame {
    public static class pair {
        String s;
        Integer i;

        public pair(String s,Integer i){
            this.s = s;
            this.i = i;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int n = sc.nextInt();

        PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->{
            if(b.i == a.i){
                return a.s.compareTo(b.s);
            }
            else return b.i - a.i;
        });

        for(int i=0;i<n;i++){
            String s = sc.next();
            int k = sc.nextInt();
            pq.add(new pair(s, k));
        }

        for(int i=0;i<n;i++){
            pair p = pq.remove();
            if(p.i >= max) System.out.print(p.s + " " + p.i);
            System.out.println();
        }
    }
}
