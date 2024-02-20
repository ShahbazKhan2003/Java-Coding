// package Problems;

import java.util.*;

public class NumberOfProvinces {

    public static void main(String[] args) {
        int[][] isConnected = {{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}};
        int n = isConnected.length;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<n;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        boolean visit[] = new boolean[n+1];
        int count = 0;
        for(int i=0;i<n;i++){
            if(visit[i]==false){
                count++;
                dfs(i, visit, adj);
            }
        }
        
        System.out.println(count);
        int ans = bfs(adj);
        System.out.println(ans);

    }
    public static void dfs(int val,boolean[] visit,List<List<Integer>> adj){
        visit[val] = true;
        
        for(var it:adj.get(val)){
            if(visit[it]==false){
                dfs(it, visit, adj);
            }
        }
    }
    public static int bfs(List<List<Integer>> adj){
        boolean[] vist = new boolean[adj.size()];
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        for(int i=0;i<vist.length;i++){
            if(vist[i] ==false){
                q.add(i);
                vist[i] = true;
                while(!q.isEmpty()){
                    int val = q.poll();
                    for(var it:adj.get(val)){
                        if(vist[it]==false){
                            q.add(it);
                            vist[it] = true;
                        }
                    }

                }
                count++;
            }
        }
        return count;
    }

}
