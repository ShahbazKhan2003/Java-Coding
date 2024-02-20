import java.util.Scanner;

public class oddneven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        String store = new String();
        for (int i = 0; i < st.length(); i++) 
        {
            if (i % 2 == 0) 
            {
                char ch = st.charAt(i);
                int n = ch+1;
                char c = (char) n;
                store= store+c;

            } 
            else 
            {
                char ch1= st.charAt(i);
                int n1=ch1-1;
                char c1=(char)n1;
                store=store+c1;
            }
        }

        System.out.println(store);


        
    }
}
