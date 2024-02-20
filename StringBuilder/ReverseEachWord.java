import java.util.*;
public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        StringBuilder st = new StringBuilder("");

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch != ' ')
            {
                st.append(ch);
            }
            else
            {
                st.reverse();
                ans+=st;
                ans+=' ';
                st = new StringBuilder("");
                
            }
        }
        st.reverse();
        ans+=st;
        System.out.println(ans);

    }
}
