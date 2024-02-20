import java.util.Scanner;

public class RemoveConsective {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        char ch = s.charAt(0);
        ans = ans +ch;

        for(int i=1;i<s.length();){
            if(s.charAt(i) == s.charAt(i-1)) i++;

            else{
                ans  = ans + s.charAt(i);
                i++;
            }
        }
        System.out.println(ans);

        
    }
}
