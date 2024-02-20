import java.util.LinkedList;
import java.util.Queue;

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

public class RottenOranges {
    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        int n = grid.length;
        int m  = grid[0].length;

        int[][] vis = new int[n][m];
        int cf = 0;
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i,j,0));
                    vis[i][j] = 2;
                }
                if(grid[i][j]==1) cf++;
            }
        }
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};
        int c =0;
        int tm = 0;
        while(!q.isEmpty()){
            int ro = q.peek().f;
            int co = q.peek().s;
            int t =  q.peek().t;
            tm = Math.max(tm,t);
            q.remove();
            for(int i=0;i<4;i++){
                int cr = ro + drow[i];
                int cc = co + dcol[i];
                if((cr>=0 && cr<n) && (cc>=0 && cc<m) && (vis[cr][cc] ==0) && (grid[cr][cc] == 1)){
                    q.add(new Pair(cr,cc,t+1));
                    vis[cr][cc] = 2;
                    c++;
                }
            }
        }
        if(c!=cf) System.out.println(-1);
        else System.out.println(tm);
    }
}
