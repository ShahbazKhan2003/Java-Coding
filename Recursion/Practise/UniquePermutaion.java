import java.util.ArrayList;
import java.util.*;

public class UniquePermutaion {
     public static void permstr(StringBuilder s,int pos ){
        if(pos >= s.length()){
           System.out.println(s);
        }
        HashSet<Character> h = new HashSet<>();
        for(int i=pos;i<s.length();i++){
           if(h.contains(s.charAt(i))) continue;
           h.add(s.charAt(i));
           swap1(i, pos, s);
           permstr(s, pos+1);
           swap1(i, pos, s);
        }
    }
    public static void main(String[] args) {
        StringBuilder  s = new StringBuilder("abb");
        permstr(s,0);
    }
    public static void swap1(int i,int j,StringBuilder s){
        char ch = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, ch);

    }
}
