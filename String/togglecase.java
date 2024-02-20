import java.util.Scanner;

public class togglecase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String x="";
        for(int i=0;i<st.length();i++)
        {
            char ch = st.charAt(i);
            if(Character.isUpperCase(ch))
            {
                x+=Character.toLowerCase(ch);
            }
            else
            {
                x+=Character.toUpperCase(ch);
            }
        }
        System.out.println(x);
    }
}
