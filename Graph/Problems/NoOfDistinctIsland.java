import java.util.*;
class Pair{
    int f;
    int s;
    public Pair(int f,int s){
        this.f = f;
        this.s = s;
    }
}
public class NoOfDistinctIsland {
    public static void main(String[] args) {
        int[][] grid= {{1, 1, 0, 0, 0},
        {1, 1, 0, 0, 0},
        {0, 0, 0, 1, 1},
        {0, 0, 0, 1, 1}};
        int n = grid.length;
        int m = grid[0].length;
        boolean vis[][] = new boolean[n][m];
        Set<List<String>> h = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1 && vis[i][j]==false){
                    List<String> arr = new ArrayList<>();
                    bfs(i,j,grid,vis,arr);
                    h.add(arr) ;
                }
            }
        }
        System.out.println(h.size());
        
    }
    public static void bfs(int r,int c,int[][] grid,boolean[][] vis,List<String> arr){
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(r, c));
        vis[r][c] = true;
        arr.add(convert(r,c,r,c));
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};

        while (!q.isEmpty()) {
            int row = q.peek().f;
            int col = q.peek().s;
            q.remove();
            for(int i=0;i<4;i++){
                int cr = dr[i] + row;
                int cc = dc[i] + col;
                if((cr>=0 && cr<n ) && (cc>=0 && cc<m) && (grid[cr][cc]==1) && (vis[cr][cc]==false)){
                    q.add(new Pair(cr, cc));
                    vis[cr][cc] = true;
                    arr.add(convert(cr, cc, r, c));
                }
            }
            
        }
    }
    public static String convert(int r,int c,int r1,int c1){
        return Integer.toString(r1-r) + " " + Integer.toString(c1-c);
    }
}
