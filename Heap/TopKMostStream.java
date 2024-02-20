import java.util.*;
public class TopKMostStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){

            int n = sc.nextInt();
            int cap = sc.nextInt();

            Map<Integer,Integer> h = new HashMap<>();
            PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->{
                if(a.getValue() == b.getValue()) return a.getKey() - b.getKey();
                else return b.getValue() - a.getValue();
            });

            for(int i=0;i<n;i++){
                int a = sc.nextInt();
                h.put(a, h.getOrDefault(a,0)+1);
                pq.clear();
                pq.addAll(h.entrySet());

                int c =0;
                while(pq.size()>0 && c<cap){
                    System.out.print(pq.remove().getKey()+" ");
                    c++;
                }
            }


            t--;
    }
  }
}
