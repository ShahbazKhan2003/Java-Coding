import java.util.Scanner;
public class qwertyqwerty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String ans="";
        boolean flag=false;
        for(int i=1;i<=s.length();i++){
            int j=i;
            String k=s.substring(0, i);
            while(j+i<=s.length() && k.equals(s.substring(j,j+i))){
                j+=i;
                if(j==s.length()){
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                ans=s.substring(0, i);
                break;
            }
        }
        if(flag==true)System.out.println(ans);
        else{
            System.out.println("Not so cool");
        }

    }
    
}
