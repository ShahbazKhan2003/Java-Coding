import java.util.*;
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "cat";

        boolean ans = isAnagram(s, t);
        System.out.println(ans); 
    }
    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> h = new HashMap<>();
        if(s.length() != t.length()) return false;

        

        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
            if(h.containsKey(ch)) 
            {
                int tot = h.get(ch);
                h.put(ch,tot+1);
            }
            else h.put(ch,1);
        }
        
        for(int i=0;i<t.length();i++){
            Character ch = t.charAt(i);
            if(h.containsKey(ch)){
                int tot = h.get(ch);
                h.put(ch,tot-1);
                if(h.get(ch) == 0) h.remove(ch);
            }
            else return false;
        }

        return h.isEmpty();
       
       

    }
}