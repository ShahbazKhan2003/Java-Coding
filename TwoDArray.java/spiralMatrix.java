import java.util.*;

public class spiralMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] matrix = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) matrix[i][j] = s.nextInt();
        }
        List<Integer> ans = new ArrayList<>();

        int sr = 0,er = n-1;
        int sc = 0,ec = m-1;

        while(sr <= er && sc <= ec){

            for(int i=sc ;i<=ec;i++){
                ans.add(matrix[sr][i]);
                // System.out.println(matrix[sr][i] + " ");
            }
            sr++;

            for(int i=sr;i<=er;i++){
                ans.add(matrix[i][ec]);
                // System.out.println(matrix[i][ec] +" ");
            }
            ec--;

            if(sr<=er){
                for(int i=ec;i>=sc;i--){
                    ans.add(matrix[er][i]);
                    //  System.out.println(matrix[er][i] +" ");
                }
                er--;
            }
            if(sc<=ec){
                for(int i=er;i>=sr;i--){
                    ans.add(matrix[i][sc]);
                    //  System.out.println(matrix[sr][i] +" ");
                }
                sc++;
            }
        }
        System.out.println(ans);
    }
}
