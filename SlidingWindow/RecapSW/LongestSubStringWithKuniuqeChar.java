import java.util.*;
public class LongestSubStringWithKuniuqeChar {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        Map<Character,Integer> h = new HashMap<>();
        int k = 5;
        int i=0,j=0,ans=-1;

        while(j<s.length()){
            char ch = s.charAt(j);
            h.put(ch , h.getOrDefault(ch, 0)+1);
            
            if(h.size() < k) j++;

            else if(h.size() == k){
                ans = Math.max(ans, j-i+1);
                j++; 
            }

            else if(h.size() > k){
                while(h.size() > k){
                    h.put(s.charAt(i), h.get(s.charAt(i))-1);
                    if(h.get(s.charAt(i)) == 0){
                        h.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        System.out.println(ans);
    }
}
