import java.util.*;
public class FIndSafeState {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();
        
        adj.add(List.of(1, 2));
        adj.add(List.of(2, 3));
        adj.add(List.of(5));
        adj.add(List.of(0));
        adj.add(List.of(5));
        adj.add(new ArrayList<>());  // Empty list for the sixth node
        adj.add(new ArrayList<>());  // Empty list for the seventh node
        int V = adj.size();
        boolean[] vis = new boolean[V];
        boolean[] pathvis = new boolean[V];
        int check[] = new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                dfs(i,vis,pathvis,check,adj);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<V;i++){
            if(check[i]==1) ans.add(i);
        }
        System.out.println(ans);
    }
    public static boolean dfs(int val,boolean[] vis,boolean[] pathvis,int[] check,List<List<Integer>> adj){
        vis[val] = true;
        pathvis[val] = true;
        check[val] = 0;
        
        for(var it : adj.get(val)){
            if(vis[it]==false){
                if(dfs(it,vis,pathvis,check,adj)==true) return true;
            }
            else if(pathvis[it]==true) return true;
        }
        check[val] = 1;
        pathvis[val] = false;
        return false;
    }
    
}
