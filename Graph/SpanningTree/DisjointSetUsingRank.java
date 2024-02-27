import java.util.*;

class DisjointSet{
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    public DisjointSet(int n){
        for(int i=0;i<=n;i++){
            rank.add(0);
            parent.add(i);
        }
    }
    public  int findUpar(int node){
        if(node == parent.get(node)) return node;

        int ulp = findUpar(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }
    public  void unionbyRank(int u , int v){
        int upar_u  = findUpar(u);
        int upar_v  = findUpar(v);

        if(upar_u == upar_v) return;
        else if(rank.get(upar_u) < rank.get(upar_v)){
            parent.set(upar_u, upar_v);
        }
        else if(rank.get(upar_v) < rank.get(upar_u)){
            parent.set(upar_v, upar_u);
        }
        else{
            parent.set(upar_v , upar_u);
            int rankval = rank.get(upar_u);
            rank.set(upar_u, rankval+1);
        }
        
 
    }
}
public class DisjointSetUsingRank{
    public static void main(String[] args) {
        DisjointSet ds = new DisjointSet(7);
        ds.unionbyRank(1,2);
        ds.unionbyRank(2,3);
        ds.unionbyRank(4,5);
        ds.unionbyRank(6,7);
        ds.unionbyRank(5,6);
        if(ds.findUpar(3) == ds.findUpar(7)){
            System.out.println("Same");
        }
        else System.out.println("Not Same");
        
        ds.unionbyRank(3, 7);
        if(ds.findUpar(3) == ds.findUpar(7)){
            System.out.println("Same");
        }
        else System.out.println("Not Same");
        
    }
}