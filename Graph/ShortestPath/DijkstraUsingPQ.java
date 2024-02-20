// package ShortestPath;
import java.util.*;
class Pair{
    int dist,node;
    public Pair(int f,int s){
        this.dist = f;
        this.node = s;
    }
}
public class DijkstraUsingPQ {
    public static void main(String[] args) {
        
        List<List<List<Integer>>> adj = new ArrayList<>();
        adj.add(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 1)),
                new ArrayList<>(Arrays.asList(2, 6))
        ));
        adj.add(Arrays.asList(
                new ArrayList<>(Arrays.asList(2, 3)),
                new ArrayList<>(Arrays.asList(0, 1))
        ));
        adj.add(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 3)),
                new ArrayList<>(Arrays.asList(0, 6))
        ));


        int S = 2;
        int V = 3;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
            return a.dist - b.dist;
        });

        pq.add(new Pair(0, S));

        int[] dis = new int[V];
        Arrays.fill(dis, Integer.MAX_VALUE);

        dis[S] = 0;

        while (!pq.isEmpty()) {
            int distance = pq.peek().dist;
            int val = pq.peek().node;
            pq.remove();

            for(var it:adj.get(val)){
                int adjnode = it.get(0);
                int adjwgt = it.get(1);
                
                if(distance + adjwgt < dis[adjnode]){
                    dis[adjnode] = distance + adjwgt;
                    pq.add(new Pair(dis[adjnode],adjnode));
                }
            }
        }
        System.out.println(Arrays.toString(dis));
    }
}

// for(int i=0;i<adj.get(val).size();i++){
//     int adjnode = adj.get(val).get(i).get(0);
//     int adjwgt = adj.get(val).get(i).get(1);

//     if(distance + adjwgt < dis[adjnode]){
//         dis[adjnode] = distance + adjwgt;
//         pq.add(new Pair(dis[adjnode],adjnode));
//     }
// }