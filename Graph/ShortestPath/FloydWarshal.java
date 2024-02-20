import java.util.*;
public class FloydWarshal {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,43},{1,0,6},{-1,-1,0}};

        int n = matrix.length;
        int[][] shortest = new int[n][n];
        
        for(int i=0;i<n;i++){
            Arrays.fill(shortest[i] , (int) (1e9));
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == -1)  shortest[i][j] = (int) (1e9);
                if(i==j) shortest[i][j] = 0;
            }
        }

        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    shortest[i][j] = Math.min(shortest[i][j] ,
                      matrix[i][k] + matrix[k][j]);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(shortest[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
