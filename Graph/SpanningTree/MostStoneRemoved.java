import java.util.*;
class DisjointSet{
    List<Integer> size = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    public DisjointSet(int n){
        for(int i=0;i<=n;i++){
            size.add(1);
            parent.add(i);
        }
    }
    public  int findUpar(int node){
        if(node == parent.get(node)) return node;

        int ulp = findUpar(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }
    public  void unionbySize(int u , int v){
        int upar_u  = findUpar(u);
        int upar_v  = findUpar(v);

        if(upar_u == upar_v) return;
        else if(size.get(upar_u) < size.get(upar_v)){
            parent.set(upar_u, upar_v);
            size.set(upar_v , size.get(upar_v) + size.get(upar_u));
        }
        else{
            parent.set(upar_v , upar_u);
            size.set(upar_u, size.get(upar_u) + size.get(upar_v));
        }
        
 
    }
}
public class MostStoneRemoved {
    public static void main(String[] args) {
        int[][] stones = {{0,0},{0,2},{1,1},{2,0},{2,2}};
        int n = stones.length;

        int maxrow = 0;
        int maxcol = 0;
        for(int i=0;i<n;i++){
            maxrow = Math.max(maxrow, stones[i][0]);
            maxcol = Math.max(maxcol, stones[i][1]);
        }
        
        DisjointSet ds = new DisjointSet(maxcol + maxrow + 1);
        Map<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<n;i++){
            int nodeRow = stones[i][0];
            int nodeCol = stones[i][1] + maxrow + 1;
            ds.unionbySize(nodeRow, nodeCol);
            h.put(nodeRow, 1);
            h.put(nodeCol, 1);
        }
        int cnt = 0;
        for(var it:h.entrySet()){
            if(ds.findUpar(it.getKey()) == it.getKey()) cnt++;
        }
        System.out.println(n - cnt);
    }
}
