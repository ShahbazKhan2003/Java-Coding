import java.util.*;
public class Infix2Prefix {
    public static void main(String[] args) {
        String infix = "9-5+3*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> opr = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57)  //if its a num then push a string
            {
                String s =""+ch;
                val.push(s);     
            }
            else if (opr.isEmpty() || ch == '(' || opr.peek() == '(') {
                opr.push(ch);
            }

            else if (ch == ')') {
                while (opr.peek() != '(') {  //order of pushing is opr-v1-v2
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o    = opr.pop();
                    String t = o+v1+v2;
                    val.push(t);
                }
                opr.pop();
            }

            else 
            {
                if (ch == '+' || ch == '-') {
                    // work perform
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o    = opr.pop();
                    String t = o+v1+v2;
                    val.push(t);

                    // push
                    opr.push(ch);
                } 
                else // agar ch == * ya %
                {
                    if (opr.peek() == '*' || opr.peek() == '/') {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o    = opr.pop();
                        String t = o+v1+v2;
                        val.push(t);
                        // push
                        opr.push(ch);
                    } else {
                        opr.push(ch);
                    }
                }
            }
        }

        // If stack is not empty
        while (val.size() > 1) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o    = opr.pop();
            String t = o+v1+v2;
            val.push(t);
        }
        String prefix = val.peek();
        System.out.println(infix);
        System.out.println(prefix);
    }
}
