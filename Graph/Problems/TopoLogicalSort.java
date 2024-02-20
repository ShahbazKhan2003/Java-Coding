import java.util.*;

public class TopoLogicalSort {
    public static void main(String[] args) {
        
        //Always applied only on DAG(Directed Acyclic Graph);
        // 1 -> 2 toh  1 2 sort hoga ,, 2 -> 1  then 2 1
        //Using bfs this sort is known as KAHN ALGO (INDEGREE 0 HAI WOH PHELE)
        //IMP TOPIC
        
        List<List<Integer>> adj = new ArrayList<>();
        int V = 5;
        Stack<Integer> st = new Stack<>();
        boolean[] vis = new boolean[V];
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                dfs(i,vis,adj,st);
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        System.out.println(ans);

        List<Integer> arr = bfs(adj);
    }
    public static List<Integer> bfs(List<List<Integer>> adj){
        List<Integer> ans = new ArrayList<>();
        int[] indegree = new int[adj.size()];
        for(int i=0;i<adj.size();i++){
            for(var it:adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0) q.add(i);
        }
        while (!q.isEmpty()) {
            int val = q.remove();
            ans.add(val);
            for(var it:adj.get(val)){
                indegree[it]--;
                if(indegree[it]==0) q.add(it);
            }
        }
        return ans;
    }

    public static void dfs(int val,boolean[] vis, List<List<Integer>> adj,Stack<Integer> st){
        vis[val] = true;

        for(var it:adj.get(val)){
            if(vis[it]==false){
                dfs(it, vis, adj, st);
            }
        }
        st.push(val);
    }
}
