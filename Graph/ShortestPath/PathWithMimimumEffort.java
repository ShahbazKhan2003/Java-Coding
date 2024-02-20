import java.util.*;
class Trio{
    int dist,first,second;
    public Trio(int f,int s, int t){
        this.dist = f;
        this.first = s;
        this.second = t;
    }
}
public class PathWithMimimumEffort {
    public static void main(String[] args) {
        int[][] heights = {{1,2,2},{3,8,2},{5,3,5}};

        int n = heights.length;
        int m = heights[0].length;

        PriorityQueue<Trio> pq = new PriorityQueue<>((a,b)->{
            return a.dist - b.dist;
        });

        int[][] min = new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(min[i], Integer.MAX_VALUE);
        }
        min[0][0] = 0;
        pq.add(new Trio(0, 0, 0));

        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};

        while(!pq.isEmpty()){
            Trio tt = pq.remove();
            int dis = tt.dist;
            int r = tt.first;
            int c = tt.second;
            if(r==n-1 && c==m-1){
                System.out.println(dis);
                break;
            }

            for(int i=0;i<4;i++){
                int row = r + dr[i];
                int col = c + dc[i];

                if(row>=0 && col>=0 && row<n && col<m){
                    int abs  = Math.abs(heights[row][col] - heights[r][c]);
                    int newEffort = Math.max(abs, dis);
                    if(newEffort < min[row][col]){
                        min[row][col] =  newEffort;
                        pq.add(new Trio(newEffort, row, col));
                    }

                }
            }

        }
        System.out.println(0);
    }
}
