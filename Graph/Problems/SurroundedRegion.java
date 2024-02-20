import java.util.*;
class Pair{
    int f;
    int s;
    public Pair(int f,int s){
        this.f = f;
        this.s =s;
    }
}
public class SurroundedRegion {
    public static void main(String[] args) {
        char[][] mat = 
        {{'X', 'O', 'X', 'X'}, 
        {'X', 'O', 'X', 'X'}, 
        {'X', 'O', 'O', 'X'}, 
        {'X', 'O', 'X', 'X'}, 
        {'X', 'X', 'O', 'O'}};

        int n =mat.length;
        int m =mat[0].length;
        boolean[][] vis = new boolean[n][m];
        Queue<Pair> q = new LinkedList<>();

        for(int i=0;i<m;i++){ 
            if(mat[0][i]=='O'){                   // 1 and last row
                     q.add(new Pair(0, i));
                     vis[0][i] = true;
            }
            if(mat[n-1][i]=='O'){
                q.add(new Pair(n-1, i));
                vis[n-1][i] = true;
            }
        }
        for(int i=0;i<n;i++){
            if(mat[i][0]=='O'){          //1 and last col
                q.add(new Pair(i, 0));
                vis[i][0] = true;
            }
            if(mat[i][m-1]=='O'){
                q.add(new Pair(i, m-1));
                vis[i][m-1] = true;
            }
        }
        
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};
        while(!q.isEmpty()){
            int row = q.peek().f;
            int col = q.peek().s;
            q.remove();
            for(int i=0;i<4;i++){
                int cr = drow[i]+row;
                int cc = dcol[i]+col;
                if((cr>=0&&cr<n) && (cc>=0&&cc<m) && (vis[cr][cc]==false) && (mat[cr][cc]=='O')){
                    q.add(new Pair(cr, cc));
                    vis[cr][cc] = true;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==false){
                    mat[i][j] = 'X';
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
