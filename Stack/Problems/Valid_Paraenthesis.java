import java.util.Scanner;
import java.util.*;
public class Valid_Paraenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        boolean check = balancedparen(str);
        System.out.println(check);
    }
    public static boolean balancedparen(String s)
    {
        
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
            {
                st.push(ch);
            }

            else if (ch == ')')
            {
                if(st.isEmpty()) return false;

                if(st.peek() == '(')
                {
                    st.pop();
                }
                else return false;
            }

            else if(ch == '}')
            {
                if(st.isEmpty()) return false;
                if(st.peek() == '{')
                {
                    st.pop();
                }
                else return false;
            }

            else if(ch == ']')
            {
                if(st.isEmpty()) return false;
                if(st.peek() == '[')
                {
                    st.pop();
                }
                else return false;
            }
            
        }

        if(st.isEmpty()) return true;
        else return false;
    }
}
