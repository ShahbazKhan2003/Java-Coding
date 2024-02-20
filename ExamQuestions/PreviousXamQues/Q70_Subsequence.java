import java.util.ArrayList;

public class Q70_Subsequence {
    public static void main(String[] args) {
        String s = "abc";

        helper(s,0,"");

    }
    public static void helper(String s,int i,String ans){
        if(i>=s.length()){
            System.out.println(ans);
            return;
        }
        helper(s, i+1, ans+s.charAt(i));
        helper(s, i+1,ans);
    }
}
