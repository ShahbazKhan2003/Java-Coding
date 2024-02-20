import java.util.*;

import ShortestPath.Pair;
class Pair{
    int v;
    int p;
    public Pair(int v,int p){
        this.v = v;
        this.p = p;
    }
}
public class CycleDetectUndirected {
    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> adj = new ArrayList<>();
        adj.add(List.of(1));             // Node 0
        adj.add(List.of(0, 2, 4));       // Node 1
        adj.add(List.of(1, 3));          // Node 2
        adj.add(List.of(2, 4));          // Node 3
        adj.add(List.of(1, 3));          // Node 4

        boolean[] vis = new boolean[V];
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                if(bfs(i,adj,vis)==true){
                    System.out.println("true");
                    break;
                }
            }
        }
        System.out.println("false");

        dfs(adj,V);
    }
    public static boolean bfs(int st,List<List<Integer>> adj,boolean[] vis){
        vis[st] = true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(st, -1));
        while (!q.isEmpty()) {
            int val = q.peek().v;
            int par = q.peek().p;
            q.remove();
            for(var it:adj.get(val)){
                if(vis[it]==false){
                    q.add(new Pair(it, val));
                    vis[it] = true;
                }
                else if(par != it) return true;
            }
        }
        return false;
    }
    public static void dfs(List<List<Integer>> adj,int V){
        boolean[] vis = new boolean[V];

        for(int i=0;i<V;i++){
            if(vis[i]==false){
                if(dfscall(i, -1,adj,vis)==true) System.out.println("True");
            }
        }
        System.out.println("False");
    }
    public static boolean dfscall(int st,int p,List<List<Integer>> adj,boolean[] vis){
        vis[st] = true;
        
        for(var it:adj.get(st)){
            if(vis[it]== false){
                if(dfscall(it, st, adj, vis) == true) return true;
            }
            else if (p!=it)  return true;
        }
        return false;
    }

}
