import java.util.*;
class Pair{
    int first,second;
    public Pair(int first,int sec){
        this.first = first;
        this.second = sec;
    }
}
public class ShortestPathinDAG {
    public static void toposort(int val,List<List<Pair>> adj,int[] vis , Stack<Integer> st){
        vis[val] = 1;
        for(var it:adj.get(val)){
            int v = it.first;
            if(vis[v]==0){
                toposort(v,adj,vis,st);
            }
        }
        st.push(val);
    }
    public static void main(String[] args) {
        int[][] edges =  {{0,1,2},{0,2,1}};
        int N = 4;
        int M = 2;
        List<List<Pair>> adj = new ArrayList<>();
		for(int i=0;i<N;i++){
		    List<Pair> temp = new ArrayList<>();
		    adj.add(temp);
		}
		for(int i=0;i<M;i++){
		    int u = edges[i][0];
		    int v = edges[i][1];
		    int wt = edges[i][2];
		    adj.get(u).add(new Pair(v,wt));
		}
		int[] vis = new int[N];
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<N;i++){
		    if(vis[i]==0){
		        toposort(i,adj,vis,st);
		    }
		}
		int[] dis = new int[N];
		Arrays.fill(dis,Integer.MAX_VALUE);
		
		dis[0] = 0;
		while(st.size()>0){
		    int node =  st.pop();
		    
		    for(var it: adj.get(node)){
		        int v = it.first;
		        int wt = it.second;
		        if(dis[node] != Integer.MAX_VALUE && dis[node] + wt < dis[v]){
		            dis[v] = dis[node] + wt;
		        }
		    }
		}
		for(int i=0;i<N;i++){
		    if(dis[i] == Integer.MAX_VALUE)  dis[i] = -1;
		}
		System.out.println(Arrays.toString(dis));
    }
}
