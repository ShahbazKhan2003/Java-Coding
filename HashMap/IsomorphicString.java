import java.util.*;
public class IsomorphicString {

    
    public static void main(String[] args) {
        String s = "paper ";
        String t = "title";
        boolean ans = isIsomorphic(s,t);
        System.out.println(ans);
    }
    public static boolean isIsomorphic(String s,String t){
        HashMap<Character,Character> h = new HashMap<>();

        for(int i=0;i<s.length();i++){
            Character sch = s.charAt(i);
            Character tch = t.charAt(i);

            if(h.containsKey(sch)){
                if(h.get(sch) != tch) return false;
            }
            else{
                if(h.containsValue(tch)) return false;

                else h.put(sch, tch);
            }
        }

        return true;
    }
    
}
