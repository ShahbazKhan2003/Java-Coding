import java.util.*;
public class Lect1 {
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.peek());
        System.out.println(st);
        // st.pop();
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println(st.size());
        System.out.println("Middle ele is "+st.elementAt(st.size()/2));
        st.set(2, 101);
        System.out.println(st);
        
    }
}
