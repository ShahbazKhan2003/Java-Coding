import java.util.*;
public class LongestSubstringWihoutRepChar {
    public static void main(String[] args) {
        String s = "pwwkew";
        Map<Character,Integer> h = new HashMap<>();

        int i=0,j=0,ans=-1;

        while(j<s.length()){
            char ch = s.charAt(j);

            while (h.containsKey(ch)) {
                h.remove(s.charAt(i));
                i++;
            }
            h.put(ch , i);
            ans = Math.max(ans, j-i+1);
            j++;
        }
        System.out.println(ans);
    }
}
