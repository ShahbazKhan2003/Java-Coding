import java.util.*;
class Pair{
    int v , w;
    public Pair(int v , int w){
        this.v = v;
        this.w = w;
    }
}
public class PrimsAlgo{
    public static void main(String[] args) {
        int[][] edges = {
            {0, 1, 5},
            {1, 2, 3},
            {0, 2, 1}
        };
        int V = 3;
        int E = 3;
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());

        for(int i=0;i<E;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int wgt = edges[i][2];

            adj.get(u).add(new Pair(v, wgt));
            adj.get(v).add(new Pair(u, wgt));
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
            return a.w - b.w;
        });

        boolean vis[] = new boolean[V];
        pq.add(new Pair(0,0));

        int ans = 0;

        while(!pq.isEmpty()){
            Pair pp = pq.remove();
            int node = pp.v;
            int dist = pp.w;

            if(vis[node]) continue;

            vis[node] = true;
            ans+=dist;

            for(var it:adj.get(node)){
                int adjnode = it.v;
                int adjwgt = it.w;
                pq.add(new Pair(adjnode, adjwgt));
            }
        }
        System.out.println(ans);
    }
}