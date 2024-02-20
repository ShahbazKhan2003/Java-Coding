import java.util.*;

public class Q4_RemoveDup {
    public static void main(String[] args) {
        String s = "Programmming";
        Stack<Character> st  = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(st.isEmpty() || st.peek()!=s.charAt(i)){
                st.push(s.charAt(i));
            }

            else if(st.peek() == s.charAt(i)){
                continue;
            }
        }
        System.out.println(st);
    }
}
