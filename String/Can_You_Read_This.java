import java.util.Scanner;

public class Can_You_Read_This {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String ans = "";
        char ch = s.charAt(0);
        ans = ans +ch;

        for(int i=1;i<s.length();i++){

            char sh = s.charAt(i);
            
            if(Character.isUpperCase(sh)){
                System.out.println(ans);
                ans = "";
                ans = ans + s.charAt(i);
            }
            else{
                ans = ans + s.charAt(i);
            }
        }
        System.out.print(ans);
    }
}
