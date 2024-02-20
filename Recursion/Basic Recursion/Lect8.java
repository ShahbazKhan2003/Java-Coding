import java.util.*;
public class Lect8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //System.out.println(s);
        int i =0;
//Remove a Char
        System.out.println(removechar(s,i));
        int j = s.length()-1;

//Reverse a String
        System.out.println(reverse(s,i));

//Check its Palindronic or not
        String ans = Palin(s,i);
        if(s.equals(ans)) System.out.println("True");
        else System.out.println("False");

        System.out.println(Palindrone(s,i,j));
        

    }
    public static String removechar(String s,int i)
    {
        // String ans = "";
        // if(i == s.length()) return ans;
        // if(s.charAt(i) != 'a') ans = ans+s.charAt(i);
        // String val = removechar(s, i+1);
        // ans = ans + val;
        // return ans;

        if(i==s.length()) return "";

        String ans = removechar(s, i+1);

        if(s.charAt(i)!='a')
        {
            return s.charAt(i)+ans;
        }
        else return ans;
    }
    public static String reverse(String s,int i)
    {
        //  if(i == -1) return "";
        //  String ans = reverse(s, i-1);
        //  char sh = s.charAt(i);
        //  ans = sh + ans;
        //  return ans;

        if(i == s.length()) return "";
        String ans = reverse(s, i+1);
        return ans + s.charAt(i);
    }

    public static String Palin(String s,int i)
    {
        if(i == s.length()) return "";
        String ans = reverse(s, i+1);
        return ans + s.charAt(i);

    }
    public static boolean Palindrone(String s,int l,int r)
    {
        if(l>=r) return true;

        return (s.charAt(l)==s.charAt(r) && Palindrone(s,l+1,r-1)); 
    }
}
