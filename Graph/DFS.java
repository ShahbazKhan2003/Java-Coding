import java.util.*;
public class DFS {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();  
        adj.add(new ArrayList<>(Arrays.asList(2, 3, 1)));
        adj.add(new ArrayList<>(Collections.singletonList(0)));
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));
        adj.add(new ArrayList<>(Collections.singletonList(0)));
        adj.add(new ArrayList<>(Collections.singletonList(2)));
        // adj =  [[2,3,1] , [0], [0,4], [0], [2]]

        int v = 5;
        boolean visit[] = new boolean[v];
        List<Integer> ans = new ArrayList<>();
        dfs(0,visit,adj,ans);
        System.out.println(ans);
    }
    public static void dfs(int val,boolean[] visit,List<List<Integer>> adj,List<Integer> ans){
        visit[val] = true;
        ans.add(val);

        for(var i:adj.get(val)){
            if(visit[i]==false){
                dfs(i, visit, adj, ans);
            }
        }
    }
}
