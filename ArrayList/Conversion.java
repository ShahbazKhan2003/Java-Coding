import java.util.*;
public class Conversion {
    public static void main(String[] args) {
        //Arraylist to  array
        Scanner sc = new Scanner(System.in);
        // ArrayList<Integer> l = new ArrayList<>();
        // while(sc.hasNextInt())
        // {
        //     l.add(sc.nextInt());
        // }

        // System.out.println(l);

        // Integer[] arr = new Integer[l.size()];
        // arr = l.toArray(arr);
        // for(int i:arr)
        // {
        //     System.out.print(i+" ");
        // }

        //Array to ArrayList

        Integer[] arr = new Integer[5];

        for(Integer i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
System.out.println();

        ArrayList<Integer> newarr = new ArrayList<>();
        Collections.addAll(newarr, arr);
        System.out.println(newarr);



        
    }
}
