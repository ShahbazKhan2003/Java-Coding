
// package Problems;
import java.util.*;

public class BalancedParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isbalanced(str));
        balancedbrackets(str);
    }

    public static boolean isbalanced(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.isEmpty())
                    return false;

                if (st.peek() == '(') {
                    st.pop();
                }
            }

        }
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void balancedbrackets(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                // if (st.isEmpty())
                // return -1;

                if (st.peek() == '(') {
                    st.pop();
                }
            }

        }
        int count = 0;
        if (!st.isEmpty()) {
            for (int i = 0; i < st.size() - 1; i++) {
                count++;
                st.pop();
            }
        }
        System.out.println(count);
    }
}
