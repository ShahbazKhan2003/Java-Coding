import java.util.Scanner;

public class StringCompresssion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String ans=""+st.charAt(0);

        int count=1;
        for(int i=1;i<st.length();i++)
        {
            char curr = st.charAt(i);
            char prev = st.charAt(i-1);

            if(curr == prev)
            {
                count++;
            }

            else
            {
                ans+=count;
                ans+=curr;
                count=1;
            }
            
        }
        ans+=count;
        System.out.println(ans);
    }
}
