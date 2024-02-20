import java.util.Arrays;
import java.util.Scanner;

public class setmatrixzero {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[][] arr= new int[n][m];
    int[][] arr2= new int[n][m];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }
    //Second array to store 1st array value
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            arr2[i][j]=arr[i][j];
        }
    }
 

    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            if(arr[i][j]==0)
            {
                //row zero krne hai
                for(int k=0;k<m;k++)
                {
                    arr2[i][k]=0;
                }
                //Column zero krne hai
                for(int k=0;k<n;k++)
                {
                    arr2[k][j]=0;
                }
            }
        }
    }

 

    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            System.out.print(arr2[i][j]+" ");
        }
        System.out.println();
    }
    }
}
