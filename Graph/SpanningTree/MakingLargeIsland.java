import java.util.*;
class DisjointSet {
    List<Integer> parent = new ArrayList<>();    
    List<Integer> size = new ArrayList<>();    
    public DisjointSet(int n ){
        for(int i=0;i<n;i++){
            parent.add(i);
            size.add(1);
        }
    }
    public int findpar(int node){
        if(parent.get(node) == node) return node;
        int ulp = findpar(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }
    public void unionbySize(int u , int v){
        int ulpU = findpar(u);
        int ulpV = findpar(v);
        if(ulpU == ulpV) return;
        if(size.get(ulpU) < size.get(ulpV)){
            parent.set(ulpU, ulpV);
            size.set(ulpV, size.get(ulpV)+size.get(ulpU));
        }
        else{
            parent.set(ulpV, ulpU);
            size.set(ulpU, size.get(ulpV)+size.get(ulpU));
        }
    }
}
public class MakingLargeIsland {
    public static boolean isValid(int r , int c , int n){
        return r>=0 && r<n && c>=0 && c<n;
    }
    public static void main(String[] args) {
        int[][] grid  = {{1,0} , {0,1}};
        int n = grid.length;
        DisjointSet ds = new DisjointSet(n);
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};

        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(grid[row][col] == 0) continue;

                for(int i=0;i<4;i++){
                    int adjr = row + dr[i];
                    int adjc = col + dc[i];
                    if(isValid(adjr , adjc , n) && grid[adjr][adjc]==1){
                        int nodeNo = row * n + col;
                        int adjNo = adjr * n + adjc;
                        ds.unionbySize(nodeNo, adjNo);
                    }
                }
            }
        }
        int max =0;
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(grid[row][col]==1) continue;

                Set<Integer> hs = new HashSet<>();
                for(int i=0;i<4;i++){
                    int adjr = row + dr[i];
                    int adjc = col + dc[i];
                    if(isValid(adjr, adjc, n) && grid[adjr][adjc] == 1){
                        int val = adjr * n + adjc;
                        hs.add(ds.findpar(val));
                    }
                }
                int size = 0;
                for(int it:hs){
                    size += ds.size.get(it);
                }
                max = Math.max(max, size+1);
            }
        }
        for(int i=0;i<n*n;i++){
            int val = ds.size.get(ds.findpar(i));
            max = Math.max(max, val);
        }
        System.out.println(max);
    }
}
