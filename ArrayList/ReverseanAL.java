import java.util.*;
public class ReverseanAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Reverse a ArrayList
//Method 1
        ArrayList<Integer> l = new ArrayList<>();
        while(sc.hasNextInt())
        {
            int i = sc.nextInt();
            l.add(i);
        }
        System.out.println(l);

        // int s=0;
        // int e = l.size()-1;
        // while(s<e)
        // {
        //     Integer temp = l.get(s);
        //     l.set(s, l.get(e));
        //     l.set(e, temp);
        //     s++;
        //     e--;
        // }
        // System.out.println(l);

//Method 2
        // Collections.reverse(l);
        // System.out.println(l);

        

        
        
    }
    
}
