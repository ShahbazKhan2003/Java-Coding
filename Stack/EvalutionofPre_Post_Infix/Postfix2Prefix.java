import java.util.*;
public class Postfix2Prefix {
    public static void main(String[] args) {
        String postfix = "953+4*6/-";
        Stack<String> val = new Stack<>();

        for(int i =0;i<postfix.length();i++)
        {
            char ch = postfix.charAt(i);
            int ascii = (int) ch;
            if(ascii>=48 && ascii<=57)
            {
                String s =""+ch;
                val.push(s);
            }
            else
            {
                String v2 = val.pop();
                String v1 = val.pop();
                char op = ch;
                String t = op + v1 + v2;

                val.push(t);
            }
        }
        String prefix = val.pop();
        System.out.println(prefix);
    }
}
