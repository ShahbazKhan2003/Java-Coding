import java.util.*;
public class BellmanFordAlgo{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(0, 1, 5)),
                new ArrayList<>(Arrays.asList(1, 0, 3)),
                new ArrayList<>(Arrays.asList(1, 2, -1)),
                new ArrayList<>(Arrays.asList(2, 0, 1))
        ));
        int S = 2;
        int V = 3;

        int[] dist = new int[V];
        Arrays.fill(dist , (int)1e8);
        dist[S] = 0; 

        for(int i=0;i<V-1;i++){
            for(var it:edges){
                int u = it.get(0);
                int v = it.get(1);
                int wgt = it.get(2);
                if(dist[u] != (int)1e8 && dist[u] + wgt < dist[v]){
                    dist[v] = dist[u] + wgt;
                }
            }
        }
        // if cycle exist then check for N iteration if dist val is reduced then it contain negative cycle
        for(var it:edges){
               int u = it.get(0);
                int v = it.get(1);
                int wgt = it.get(2);
                if(dist[u] != (int)1e8 && dist[u] + wgt < dist[v]){
                    System.out.println(-1);
                }
        }
        System.out.println(Arrays.toString(dist));
    }
}