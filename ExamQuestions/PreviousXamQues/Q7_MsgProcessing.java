import java.util.Scanner;

public class Q7_MsgProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        
        String ans = s.trim();
        String st = "";

        for(int i=0;i<ans.length();i++){
            if(ans.charAt(i) != ' '){
                st = st + ans.charAt(i);
            }
        }
        char ch = Character.toUpperCase(st.charAt(0));
        System.out.println(ch);
        
        System.out.println(st);
    }
}
