import java.util.*;
class DisjointSet{
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    public DisjointSet(int n){
        for(int i=0;i<n;i++){
            parent.add(i);
            size.add(1);
        }
    }
    public int findpar(int node){
        if(parent.get(node) == node) return node;
        int ult = findpar(parent.get(node));
        parent.set(node , ult);
        return parent.get(node);
    }
    public void unionbySize(int u , int v){
        int ultU = findpar(u);
        int ultV = findpar(v);
        if(ultU == ultV) return;
        else if(size.get(ultU) < size.get(ultV)){
            parent.set(ultU , ultV);
            size.set(ultV , size.get(ultU) + size.get(ultV));
        }
        else{
            parent.set(ultV , ultU);
            size.set(ultU , size.get(ultU) + size.get(ultV));
        }
    }
}
class NetworkConnected {
    public static int makeConnected(int n, int[][] connections) {
        DisjointSet ds = new DisjointSet(n);
        int extra = 0;
        for(int i=0;i<connections.length;i++){
            int u = connections[i][0];
            int v = connections[i][1];
            if(ds.findpar(u) == ds.findpar(v)) extra++;
            else{
                ds.unionbySize(u,v);
            }
        }
        int comp = 0;
        for(int i=0;i<n;i++){
            if(ds.parent.get(i) == i) comp++;
        }
        int ans = comp-1;
        if(extra >= ans) return ans;
        else return -1;
    }
}