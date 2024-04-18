import java.util.*;

public class Kosaraju {
    public static void dfs(int i , int[] vis , List<List<Integer>> adj , Stack<Integer> st){
        vis[i] = 1;

        for(var it:adj.get(i)){
            if(vis[it] == 0){
                dfs(it, vis, adj, st);
            }
        }
        st.push(i);
    }
    public static void dfs1(int i , int[] vis , List<List<Integer>> adj ){
        vis[i] = 1;

        for(var it:adj.get(i)){
            if(vis[it] == 0){
                dfs1(it, vis, adj);
            }
        }
    }
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();
        int V = 5;
        Stack<Integer> st = new Stack<>();
        int[] vis = new int[V];

        for(int i=0;i<V;i++){
            if(vis[i] == 0){
                dfs(i,vis,adj,st);
            }
        }
        List<List<Integer>> rev = new ArrayList<>();

        for(int i=0;i<V;i++){
            vis[i] = 0;
            for(var it:adj.get(i)){
                rev.get(it).add(i);
            }
        }

        int cnt = 0;
        while (!st.isEmpty()) {
            int node = st.pop();
            if(vis[node] == 0){
                cnt++;
                dfs1(node, vis, adj);
            }
        }
        System.out.println(cnt);
    }
}
