import java.lang.reflect.Array;
import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        //
        // Scanner scan= new Scanner(System.in);
        // int key=scan.nextInt();
        // LinearSearch

        // int flag=0;
        // for(int i=0;i<arr.length;i++)
        // {
        // if(arr[i]==key)
        // {
        // System.out.println(i);
        // flag++;
        // break;
        // }
        // }
        // if(flag==0)
        // {
        // System.out.println("Not found");
        // }

        // Max and MIN

        // int max = -9999;
        // int min = 100000;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > max) {
        // max = arr[i];
        // }
        // }
        // System.out.println(max);
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] < min) {
        // min = arr[i];
        // }
        // }
        // System.out.println(min);

        // SelectionSort
        // for (int i = 0; i < arr.length; i++)
        // {
        // for (int j = i; j < arr.length-1; j++)
        // {
        // if(arr[i]>arr[j])
        // {
        // int temp=arr[i];
        // arr[i]=arr[j];
        // arr[j]=temp;
        // }
        // }
        // }
        // for(int i=0;i<arr.length;i++)
        // {
        // System.out.print(arr[i]+" ");
        // }

        // Pair sum

        // int []brr={1,2,3,5,5,6,7};
        // int target=9;

        // for(int i=0;i<brr.length;i++)
        // {
        // for(int j=i+1;j<brr.length;j++)
        // {
        // if(brr[i]+brr[j]==target)
        // {
        // System.out.println(brr[i] + " " + brr[j]);
        // }
        // }
        // if(i>brr.length)
        // {
        // break;
        // }
        // }

        // int s=0;
        // int e=brr.length-1;
        // while(s<e)
        // {
        // if(brr[s]+brr[e]<target)
        // {
        // s++;
        // }
        // else if(brr[s]+brr[e]>target)
        // {
        // e--;
        // }
        // else
        // {
        // System.out.println(brr[s]+ " " +brr[e]);
        // s++;
        // e--;
        // }
        // }

        // int num[]={1,2,3,4};
        // int ans=1;
        // for(int i=0;i<num.length;i++)
        // {
        // ans=ans*num[i];
        // }

        // for(int i=0;i<num.length;i++)
        // {
        // num[i]=ans/num[i];
        // }
        // // System.out.println(Array.toString(num));
        // for(int i=0;i<num.length;i++)
        // {
        // System.out.println(num[i]);
        // }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        antispiral(arr, n, m);
    }

    public static void antispiral(int[][] arr, int n, int m) {
        int sr = 0;
        int sc = 0;
        int er = n - 1;
        int ec = m - 1;

        while (sr <=er && sc <=ec) {
            for (int i = sr; i <= er; i++) {
                System.out.print(arr[i][sc] + ", ");
            }
            sc++;

            for (int i = sc; i <= ec; i++) {
                System.out.print(arr[er][i] + ", ");
            }
            er--;

            if (sr <=er) {
                for (int i = er; i >= sr; i--) {
                    System.out.print(arr[i][ec] + ", ");
                }
            }
            ec--;

            if (sc <=ec) {
                for (int i = ec; i >= sc; i++) {
                    System.out.print(arr[sr][i] + ", ");
                }
            }
            sr++;
        }
        System.out.print("END");

    }
}
