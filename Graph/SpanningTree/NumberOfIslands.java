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
public class NumberOfIslands {
    public static void main(String[] args) {
        int  n = 4;
        int m = 5;   
        int[][] operators = new int[n][m];
        DisjointSet ds = new DisjointSet(n*m);

        int len = operators.length;
        int cnt = 0;
        List<Integer> ans = new ArrayList<>();
        int[][] vis = new int[n][m];

        for(int i=0;i<4;i++){
            int row = operators[i][0];
            int col = operators[i][1];
            if(vis[row][col] == 1){
                ans.add(cnt);
                continue;
            }
            cnt++;
            vis[row][col] = 1;

            int[] dr = {-1,0,1,0};
            int[] dc = {0,1,0,-1};

            for(int idx = 0;idx<4;idx++){
                int adjr = row + dr[i];
                int adjc = col + dc[i];
                if(isValid(adjr,adjc,n,m)){
                    if(vis[adjr][adjc] == 1){
                        int nodeNo = row * m + col;
                        int adjNo = adjr * m  + adjc;
                        if(ds.findpar(nodeNo) != ds.findpar(adjNo)){
                            cnt--;
                            ds.unionbySize(nodeNo, adjNo);
                        }
                    }
                }
            }
            ans.add(cnt);
        }
        System.out.println(ans);

    }
    public static boolean isValid(int r , int c , int n , int m){
        return r>=0 && r<n && c>=0 && c<m;
    }
}
