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
public class DisjointSetUsingSize{
    public static void main(String[] args) {
        DisjointSet ds = new DisjointSet(7);
        ds.unionbySize(1,2);
        ds.unionbySize(2,3);
        ds.unionbySize(4,5);
        ds.unionbySize(6,7);
        ds.unionbySize(5,6);
        if(ds.findUpar(3) == ds.findUpar(7)){
            System.out.println("Same");
        }
        else System.out.println("Not Same");
        
        ds.unionbySize(3, 7);
        if(ds.findUpar(3) == ds.findUpar(7)){
            System.out.println("Same");
        }
        else System.out.println("Not Same");
        
    }
}