import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        // for (int i = 0; i < n; i++) 
        // {
        // for (int j = 0; j < m; j++) 
        // {
        // System.out.print(arr[i][j] + " ");
        // }
        // }


// WavePrint
        // for (int j = 0; j < m; j++) {
        // if (j % 2 == 0)
        // {
        // for (int i = 0; i < n; i++) {
        // System.out.print(arr[i][j]+" ");
        // }
        // }
        // else
        // {
        // for(int i=n-1;i>=0;i--)
        // {
        // System.out.print(arr[i][j]+" ");
        // }
        // }
        // }
        
//SpiralPrint
     int sr=0;
     int sc=0;
     int er=n-1;
     int ec=m-1;
     while(sr<=er && sc<=ec)
     {
        for(int i=sc;i<=ec;i++)
        {
            System.out.print(arr[sr][i]+" ");
        }
        sr++;
        for(int i=sr;i<=er;i++)
        {
            System.out.print(arr[i][ec]+" ");
        }
        ec--;
        if(sr<er)
        {
        for(int i=ec;i>=sc;i--)
        {
            System.out.print(arr[er][i]+" ");
        }
        er--;
       }
       if(sc<ec)
       {
        for(int i=er;i>=sr;i--)
        {
            System.out.print(arr[i][sc]+" ");
        }
        sc++;
      }
    }

    
}

}
