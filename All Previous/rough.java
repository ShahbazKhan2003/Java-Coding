import java.util.*;

public class rough {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int[] arr = new int[n];

        // for(int i=0;i<n;i++)
        // {
        //     arr[i]=sc.nextInt();
        // }
//Array Insertion

        // int pos;
        // pos=sc.nextInt();
        // int num;
        // num=sc.nextInt();
        // for(int i=n-1;i>=pos;i--)
        // {
        //     arr[i+1]=arr[i];
        // }
        // arr[pos]=num;
        // for(int i:arr)
        // {
        //     System.out.println(i);
        // }

//Array Deletion

    // int pos;
    // pos=sc.nextInt();
    // for(int i=pos;i<n-1;i++)
    // {
    //     arr[i]=arr[i+1];
    // }
    // for(int i=0;i<n-1;i++)
    // {
    //     System.out.println(arr[i]+ " ");
    // }

//Unique element
    // int ans=0;
    // for(int i=0;i<n;i++)
    // {
    //     ans= ans^arr[i];
    // }
    // System.out.println(ans);

//Reverse after n
       
    //  int m=sc.nextInt();
    //  int s=m;
    //  int e=arr.length-1;
    //  while(s<=e)
    //  {
    //     int temp=arr[s];
    //     arr[s]=arr[e];
    //     arr[e]=temp;
    //     s++;
    //     e--;
    //  }
    //  for(int i:arr)
    //  {
    //     System.out.print(i+" ");
    //  }
//Rain Water
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }

    int[] left = new int [n];
    left[0] = arr[0];
    for(int i=1;i<n;i++)
    {
        left[i]=Math.max(left[i-1], arr[i]);
    }
    int[] right= new int[n];

    right[n-1] = arr[n-1];

    for(int i=n-2;i>=0;i--)
    {
        right[i]= Math.max(right[i+1], arr[i]);
    }

    int water=0;


    for(int i=0;i<n;i++)
    {
        water+= (Math.min(left[i], right[i])- arr[i]);
    }

    System.out.println(water);
    }
}
