import java.util.*;

public class CycleDetectDirected {
    public static void main(String[] args) {
         List<List<Integer>> adj = new ArrayList<>();

        adj.add(Arrays.asList(1));  // Vertices adjacent to 0
        adj.add(Arrays.asList(2));  // Vertices adjacent to 1
        adj.add(Arrays.asList(3));  // Vertices adjacent to 2
        adj.add(Arrays.asList());  // Vertices adjacent to 3

        boolean[] vis = new boolean[adj.size()];
        boolean[] inrecurion = new boolean[adj.size()];
        for(int i=0;i<adj.size();i++){
            if(vis[i]==false){
                if(dfs(i,vis,adj,inrecurion)==true) System.out.println("True");
            }
        }
        bfs(adj);
    }
    public static void bfs(List<List<Integer>> adj){
        Queue<Integer> q = new LinkedList<>();

        int[] indegree = new int[adj.size()];
        for(int i=0;i<adj.size();i++){
            for(var it:adj.get(i)){
                indegree[it]++;
            }
        }
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0) q.add(i);
        }
        int size = 0;
        while (!q.isEmpty()){
            int val = q.remove();
            size++;
            for(var it:adj.get(val)){
                indegree[it]--;
                if(indegree[it]==0) q.add(it);
            }
        }
        if(size == adj.size()) System.out.println("False");
        else System.out.println("True");
    }
    public static boolean dfs(int val,boolean[] vis,List<List<Integer>> adj,boolean[] inrecurion){
        vis[val] = true;
        inrecurion[val] = true;
        for(int it:adj.get(val)){
            if(vis[it]==false){
                if(dfs(it, vis, adj,inrecurion)==true) return true;
            }
            else if(inrecurion[it]==true) return true;
            
        }
        inrecurion[val] = false;
        return false;
    }
}
