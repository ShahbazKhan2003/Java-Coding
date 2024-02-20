import java.util.*;
public class Lect2 {
    public static class pair{
        int v1;
        int v2;
        public pair(int v1 ,int v2){
            this.v1 = v1;
            this.v2 = v2;
        }
    }
    public static void main(String[] args) {

        PriorityQueue<pair> pq  = new PriorityQueue<>((a,b)->{
            if(a.v1!=b.v1) return a.v1 - b.v1;
            return b.v2 - a.v2;
        });
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            pq.add(new pair(a, b));
        }
       while(pq.size()>0){
        pair  p = pq.remove();
        System.out.println(p.v1 +" " +p.v2);
       }

    }
}
