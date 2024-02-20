	import java.util.*;
public class BasicFunction {
    public static void main(String[] args) {
        
        //Wrapper class = JB primitvie data ko use na kre 
        //(primitive) ko he ek class mei kr k object ki tarah use kreh
        //Reason being ki HUM OOPs kr rhe hai bhai
        // Issmei First word Capital hota hai bss

        // Integer i = 100;
        // System.out.println(i);
        // String name = "Shah";
        // System.out.println(name);
        // Character c = 'S';
        // System.out.println(c);

        ArrayList<Integer> l1 = new ArrayList<>();
        
        //Add element
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);

        //Get Element
        System.out.println(l1.get(2));


        //Print with loop
//         for(int i=0;i<l1.size();i++)
//         {
//             System.out.print(l1.get(i)+" ");
//         }
// System.out.println();

        //Print with arraylist
        System.out.println(l1);

        //Add ele at random index
        l1.add(1,100);
        System.out.println(l1);

        //Modify ele at specific index
        l1.set(1, 900);
        System.out.println(l1);

        //Remove an element at index
        l1.remove(1);
        System.out.println(l1);

        //Remove ele by value
        l1.remove(Integer.valueOf(20));
        System.out.println(l1);

        //Check ele exist or not

        boolean ans = l1.contains(Integer.valueOf(10));
        System.out.println(ans);

        //Empty check
        if(l1.isEmpty())
        {
            System.out.println("empty hai bhai");
        }
        else
        {
            System.out.println("NOt empty");
        }

        //Input of various data type
        ArrayList s1 = new ArrayList();
        s1.add(1);
        s1.add("shah");
        s1.add('S');

       // s1.add(true);
        System.out.println(s1);
      
        //User Input in ArrayList
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l2= new ArrayList<>();
        while(sc.hasNextInt())
        {
            l2.add(sc.nextInt());
        }
        for(int i:l2)
        {
            System.out.print(i+" ");
        }

        //Arraylist to array
        Object[] arr = l2.toArray();
        System.out.println(arr.toString());

       
    }
    
}
