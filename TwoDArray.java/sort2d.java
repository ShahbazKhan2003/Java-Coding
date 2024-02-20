import java.util.*;

public class sort2d{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) arr[i][j] = sc.nextInt();
        }

        Arrays.sort(arr, (a,b)-> Integer.compare(a[2],b[2])); // It sort by column wise [0] = 1st col, [2] =2nd col sort

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) System.out.print(arr[i][j] +" ");;

            System.out.println();
        }


    }
}