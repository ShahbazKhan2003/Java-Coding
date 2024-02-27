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
class AccountsMerge{
    public static void main(String[] args) {
        int n = 7;
        List<List<String>> adj = new ArrayList<>();
        DisjointSet ds = new DisjointSet(7);
        Map<String,Integer> h = new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=1;j<adj.get(i).size();j++){
                String mail = adj.get(i).get(j);
                if(h.containsKey(mail)==false){
                    h.put(mail, i);
                }
                else{
                    ds.unionbySize(h.get(mail), i);
                }
            }
        }
        List<String>[] arr = new ArrayList[n];
        for(int i=0;i<n;i++) arr[i] = new ArrayList<String>();

        for(var it:h.entrySet()){
            String mail = it.getKey();
            int node = ds.findpar(it.getValue());
            arr[node].add(mail);
        }
        List<List<String>> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i].size()==0) continue;
            Collections.sort(arr[i]);
            List<String> temp = new ArrayList<>();
            temp.add(adj.get(i).get(0));
            for(var it:arr[i]){
                temp.add(it);
            }
            ans.add(temp);
        }
        System.out.println(ans);
    }
}