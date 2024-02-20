import java.util.Scanner;

public class CBnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        
        printsubstring(st);


    }
    public static void printsubstring(String st) {
        for(int i=1;i<=st.length();i++)
        {
            for(int start=0;start<=st.length()-i;start++)
            {
                int end=start+i;
                String s= st.substring(start, end);
                System.out.println(s);
            }             
        }
    }
}
