import java.util.Scanner;

public class StringCOmpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char ch = s.charAt(0);
        String ans = "";
        ans = ans +ch;

        int count =1;
        
        for(int i=1;i<s.length();i++){

            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }

            else{
                if(count>1){
                    ans = ans + count;
                    ans = ans + s.charAt(i);
                }
                else{
                    ans = ans + s.charAt(i);

                }
                count =1;
            }
        }
        if(count >1){
            ans = ans + count;
        }
      
      

        System.out.println(ans);
    }
}
