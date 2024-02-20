import java.util.*;;
public class BipartiteGrpah {
    public static void main(String[] args) {
        int[][] graph = {{1,2,3},{0,2},{0,1,3},{0,2}};
        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<graph.length;i++) adj.add(new ArrayList<>());
        
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(i).add(graph[i][j]);
            }
        }

        int[] col = new int[adj.size()];
        Arrays.fill(col,-1);

        for(int i=0;i<col.length;i++){
            if(col[i]==-1){
                if(bfs(i,adj,col)==false) System.out.println(false);;
            }
        }
        System.out.println(true);
    }
    public static boolean bfs(int val,List<List<Integer>> adj,int[] col){
        Queue<Integer> q = new LinkedList<>();
        q.add(val);
        col[val] = 0;

        while(!q.isEmpty()){
            int node = q.remove();
            for(var it : adj.get(node)){
                if(col[it]==-1){
                    q.add(it);
                    col[it] = 1 - col[node];
                }
                else if(col[node] == col[it]) return false;
            }
        }
        return true;
    }
}
