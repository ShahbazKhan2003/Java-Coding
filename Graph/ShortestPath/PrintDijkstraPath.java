// package ShortestPath;
import java.util.*;
class Pair{
    int dist,node;
    public Pair(int f,int s){
        dist = f;
        node = s;
    }
}
public class PrintDijkstraPath {
    public static void main(String[] args) {
        int[][] edges = {{1,2,2} , {2,5,5} , {2,3,4} ,{1,4,1} , {4,3,3} , {3,5,1}};
        int n = 5;
        int m = 6;

        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++){
            List<Pair> temp = new ArrayList<>();
            adj.add(temp);
        }

        for(int i=0;i<m;i++){
            adj.get(edges[i][0]).add(new Pair(edges[i][2], edges[i][1]));
            adj.get(edges[i][1]).add(new Pair(edges[i][2], edges[i][0]));
        }

        PriorityQueue<Pair> p = new PriorityQueue<>((a,b)->{
            return a.dist - b.dist;
        });

        int[] parent = new int[n+1];
        int[] dis = new int[n+1];
        for(int i=1;i<=n;i++){
            parent[i] = i;
            dis[i] = Integer.MAX_VALUE;
        }

        dis[1] = 0;
        p.add(new Pair(0, 1));

        while(!p.isEmpty()){
            int distance = p.peek().dist;
            int val = p.peek().node;
            p.remove();
            
            for(var it:adj.get(val)){
                int adjwgt = it.dist;
                int adjnode = it.node;

                if(distance + adjwgt < dis[adjnode]){
                    dis[adjnode] = distance + adjwgt;
                    parent[adjnode] = val;
                    p.add(new Pair(dis[adjnode] , adjnode));
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        if(dis[n]==Integer.MAX_VALUE) ans.add(-1);

        int node = n;

        while(parent[node] != node){
            ans.add(node);
            node  = parent[node];
        }
        ans.add(1);
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
