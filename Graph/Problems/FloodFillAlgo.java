import java.util.*;
class Pair{
    int f;
    int s;
    public Pair(int f,int s){
        this.f = f;
        this.s = s;
    }
}

public class FloodFillAlgo {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 1},{1, 1, 0},{1, 0, 1}};
        int sr= 1;
        int sc = 1;
        int color = 2;
        

        int n = image.length;
        int m = image[0].length;
        int[][] ans = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) ans[i][j] = image[i][j];
        }
        int[][] vis = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(sr, sc));
        vis[sr][sc] = 1;
        ans[sr][sc] = color;
        while(!q.isEmpty()){
            int ro = q.peek().f;
            int co = q.peek().s;
            q.remove();
            for(int i=-1;i<=1;i++){
                for(int j=-1;j<=1;j++){
                    if((i==0 && j==0) || (i!=0 && j!=0)) continue;
                    int cr = i+ro;
                    int cc = j+co;
                    if((cr>=0 && cr<n) &&(cc>=0 && cc<m) && (vis[cr][cc]==0) && (image[cr][cc] == image[sr][sc])){
                        vis[cr][cc] = 1;
                        ans[cr][cc] = color;
                        q.add(new Pair(cr, cc));
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }

    }
}
