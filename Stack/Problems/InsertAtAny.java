// package Problems;
import java.util.*;
public class InsertAtAny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        while(sc.hasNext())
        {
            st.push(sc.nextInt());
        }
        System.out.println(st);
        st.add(0,100);
        System.out.println(st);
        
// ya toh 2 stack leke krlo
    }
}
