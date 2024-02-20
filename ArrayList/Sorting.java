import java.util.*;
public class Sorting {
    public static void main(String[] args) {
// For Integers        
        Scanner sc = new Scanner(System.in);
        // ArrayList<Integer> l = new ArrayList<>();
        // while(sc.hasNextInt())
        // {
        //     int i = sc.nextInt();
        //     l.add(i);
        // }
        // System.out.println(l);

        // Collections.sort(l);
        // System.out.println(l);

//In Descending Order
    //  Collections.sort(l, Collections.reverseOrder());
    //  System.out.println(l);

     //For String

    //  ArrayList<String> l = new ArrayList<>();
    //     while(sc.hasNext())
    //     {
    //         String i = sc.nextLine();
    //         l.add(i);
    //     }
    //     System.out.println(l);

    //     Collections.sort(l);
    //     System.out.println(l);
     int n = sc.nextInt();

     int sq  = (n*n);

     int ans =0;
     while(sq!=0)
     {
        int r = sq%10;
        ans = ans+ r;
        sq = sq/10;
     }

     if(n == ans)
     {
        System.out.println("neon");
     }
     else
     {
        System.out.println("not neon");
     }


    }
}
