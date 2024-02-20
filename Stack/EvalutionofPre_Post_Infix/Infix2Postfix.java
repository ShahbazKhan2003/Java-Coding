import java.util.*;
public class Infix2Postfix {
    public static void main(String[] args) {
        String infix = "9-5+3*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> opr = new Stack<>();

        for(int i =0;i<infix.length();i++)
        {
            char ch = infix.charAt(i);
            int ascii = (int) ch;
            if(ascii>=48 && ascii <= 57)
            {
                String s = "" + ch;
                val.push(s);
            }
            else if ( opr.isEmpty() || ch == '(' || opr.peek()== '(') opr.push(ch);
            
            else if ( ch == ')')
            {
                while(opr.peek()!='(')
                {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = opr.pop();
                    String t = v1+v2+o;
                    val.push(t);
                }
                opr.pop();
            }

            else
            {
                if(ch == '+' || ch == '-')
                {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = opr.pop();
                    String t = v1+v2+o;
                    val.push(t);
                    opr.push(ch);
                }
                else
                {
                    if(opr.peek() == '*' || opr.peek()=='/')
                    {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = opr.pop();
                        String t = v1+v2+o;
                        val.push(t);
                        opr.push(ch);
                    }
                    else opr.push(ch);
                }
            }
        }
        while(val.size()>1)
        {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = opr.pop();
            String t = v1+v2+o;
            val.push(t);
        }
        String postfix = val.pop();
        System.out.println(infix);
        System.out.println(postfix);
    }
}
