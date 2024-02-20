import java.util.*;
class Pair{
    int first;
    int second;
    public Pair(int f,int s){
        first  = f;
        second = s;
    }
}
public class NoOfIslands {
    public static void main(String[] args) {
        char[][] grid = {{'0','1'},{'1','0'},{'1','1'},{'1','0'}}; 
         int[][] vist= new int[grid.length][grid[0].length];

         int count = 0;
         for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(vist[i][j]==0 && grid[i][j] =='1'){
                    count++;
                    bfs(i,j,vist,grid);
                }
            }
         }
         System.out.println(count);
    }
    public static void bfs(int ro,int co,int[][] vist,char[][] grid){
        vist[ro][co] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(ro,co));
        int n = grid.length;
        int m = grid[0].length;
        while(q.size()>0){
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();
            for(int i=-1;i<=1;i++){
                for(int j=-1;j<=1;j++){
                    int cr = i+row;
                    int cc = j+col;
                    if((cr>=0 && cr<n) && (cc>=0 && cc<m) && (grid[cr][cc]=='1') && (vist[cr][cc]==0)){
                        vist[cr][cc] = 1;
                        q.add(new Pair(cr, cc));
                    }
                }
            }
        }
    }
}
