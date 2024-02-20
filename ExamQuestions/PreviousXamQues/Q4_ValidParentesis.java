import java.util.*;
public class Q4_ValidParentesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sa = sc.nextLine();

        String s = "";
        for(int i =0;i<sa.length();i++){
            char ch = sa.charAt(i);
            if(ch=='(' || ch =='{' || ch=='[' || ch == ')' || ch=='}' || ch==']') s = s + ch;
        }
        System.out.println(s);

        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch =='{' || ch=='[' ) st.push(ch);

            else if(!st.isEmpty()){
                char ds = st.peek();
                if(ds=='('){
                    if(ch==')') st.pop();
                    else System.out.println("False");
                }
                if(ds=='{'){
                    if(ch=='}') st.pop();
                    else System.out.println("False");
                }
                if(ds=='['){
                    if(ch==']') st.pop();
                    else System.out.println("False");
                }

            }
            else  System.out.println("False");
        }
        if(st.isEmpty()) System.out.println("True");
        else System.out.println("False");

    }
}
