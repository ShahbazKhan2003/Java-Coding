import java.util.*;
class Pair{
    int f;
    int s;
    public Pair(int f,int s){
        this.f = f;
        this.s = s;
    }
}
public class NumberEnclaves {
    public static void main(String[] args) {
        int[][] grid = 
        {{0, 0, 0, 0},
        {1, 0, 1, 0},
        {0, 1, 1, 0},
        {0, 0, 0, 0}};

        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        Queue<Pair> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || j==0 || i==n-1 || j==m-1){
                    if(grid[i][j]==1){
                        q.add(new Pair(i, j));
                        vis[i][j] = true;
                    }
                }
            }
        }
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        while(!q.isEmpty()){
            int row = q.peek().f;
            int col = q.peek().s;
            q.remove();
            for(int i=0;i<4;i++){
                int cr = dr[i] + row;
                int cc = dc[i] + col;
                while((cr>=0 && cr<n) && (cc>=0&&cc<m) &&(vis[cr][cc]==false) && grid[cr][cc]==1){
                    q.add(new Pair(cr, cc));
                    vis[cr][cc] = true;
                }
            }
        }
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==false && grid[i][j] ==1) count++;
            }
        }
        System.out.println(count);
    }
}
