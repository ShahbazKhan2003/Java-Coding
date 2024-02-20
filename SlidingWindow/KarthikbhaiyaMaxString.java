import java.util.*;

public class KarthikbhaiyaMaxString {
    public static void main(String[] args) {
        String st = "abbba";
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch == 'a')
                countA++;
            else
                countB++;
        }
        
        if (countA > countB) {
            st = st.replace('b', 'a');
        } else {
            st = st.replace('a', 'b');
        }
        System.out.println(st);
        System.out.println(st.length());
    }
}
