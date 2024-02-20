import java.util.Scanner;

public class AntiDiagonal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] matrix = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) matrix[i][j] = s.nextInt();
        }

        int len = n+m-1;

        for(int i=0;i<len;i++){
            for(int row = 0;row<n;row++){
                for(int col=0;col<m;col++){
                    if(i == row+col){
                        System.out.print(matrix[row][col] +" ");
                    }
                }
            }
        }


    }
}
