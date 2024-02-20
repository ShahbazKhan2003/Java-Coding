import java.util.Scanner;
import java.util.*;
public class lect1 {
    public static void main(String[] args) {
        // StringBuilder st = new StringBuilder("shahbaz");
        // System.out.println(st);
        // System.out.println(st.charAt(1));
        
 // Change char value
//         st.setCharAt(1, 'P');
//         System.out.println(st);

// Append
        // st.append("shah");
        // System.out.println(st);
        // st.append(8);
        // System.out.println(st);

//Insert
        // st.insert(2, 'S');
        // System.out.println(st);
 //Delete
        // st.deleteCharAt(2);
        // System.out.println(st);
//Reverse
        //  st.reverse();
        //  System.out.println(st);
        //  st.reverse();
// //Delete
        // st.delete(0,3);

        // System.out.println(st );
        // st.deleteCharAt(st.length()-1);
        
        int num = 210;
        StringBuilder sb = new StringBuilder(Integer.toString(num));
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        if(sb.charAt(0)=='0') sb.deleteCharAt(0);
        System.out.println(sb.toString());
        
    }
}
