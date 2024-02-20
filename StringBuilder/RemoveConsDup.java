import java.util.*;
public class RemoveConsDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String ans=""+st.charAt(0);

        for(int i=1;i<st.length();i++)
        {
            char curr = st.charAt(i);
            char prev = st.charAt(i-1);

            if(curr != prev)
            {
                ans+=curr;
            }
        }

        System.out.println(ans);
    }
}
