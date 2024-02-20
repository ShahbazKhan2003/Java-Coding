import java.util.*;
class Pair{
    int f;
    int s;
    int t;
    public Pair(int f,int s,int t){
        this.f = f;
        this.s = s;
        this.t = t;
    }
}
public class Nearest0 {
    public static void main(String[] args) {
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        int n = mat.length;
        int m = mat[0].length;

        boolean[][] vis = new boolean[n][m];
        int[][] ans = new int[n][m];

        Queue<Pair> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new Pair(i,j,0));
                    vis[i][j] = true;
                }
            }
        }
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};
        while(!q.isEmpty()){
            int row = q.peek().f;
            int col = q.peek().s;
            int st = q.peek().t;
            ans[row][col] = st;
            q.remove();
            for(int i=0;i<4;i++){
                int cr = drow[i] + row;
                int cc = dcol[i] + col;
                if((cr>=0 && cr<n)&& (cc>=0 && cc<m)&& (vis[cr][cc]==false)){
                    vis[cr][cc] = true;
                    q.add(new Pair(cr,cc,st+1));
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
