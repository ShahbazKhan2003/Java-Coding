import java.util.*;
public class PickToys{
    public static void main(String[] args) {
        String s = "abaccab";

        int i=0,j=0,ans =0;
        Map<Character,Integer> h = new HashMap<>();

        while(j<s.length()){
            h.put(s.charAt(j) , h.getOrDefault(s.charAt(j), 0)+1);

            if(h.size() <= 2) {
                ans = Math.max(ans , j-i+1);
            }

            else if(h.size() > 2){
                while (h.size() > 2) {
                    h.put(s.charAt(i), h.get(s.charAt(i))-1);
                    if(h.get(s.charAt(i))==0) h.remove(s.charAt(i));
                    i++;
                }
            }
            j++;
        }
        System.out.println(ans);
    }       
}