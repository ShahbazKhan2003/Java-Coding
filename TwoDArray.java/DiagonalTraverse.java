import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DiagonalTraverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                matrix[i][j] = s.nextInt();
        }

        // int len = n + m - 1;

        // for (int i = 0; i < len; i++) {
        //     for (int row = 0; row < n; row++) {
        //         for (int col = 0; col < m; col++) {
        //             if (row + col == i) {
        //                 if (i % 2 != 0) {
        //                     System.out.print(matrix[row][col] + " ");
        //                 } 
        //                 else {
        //                     System.out.print(matrix[col][row] + " ");
        //                 }
        //             }
        //         }
        //     }
        // }
        int ans[] = new int[n*m];
        int k=0;
        for(int i=0;i<n+m-1;i++){
            List<Integer> arr = new ArrayList<>();
            for(int row=0;row<n;row++){
                for(int col=0;col<m;col++){
                    if(i == row + col){
                        arr.add(matrix[row][col]);
                    }
                }
            }
            if(i%2==0){
                Collections.reverse(arr);
                for(int st:arr) ans[k++] = st; 
            }
            else for(int st:arr ) ans[k++] = st;
        }
        System.out.println(Arrays.toString(ans));

    }
}
