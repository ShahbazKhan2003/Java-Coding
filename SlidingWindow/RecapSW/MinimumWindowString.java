import java.util.*;
public class MinimumWindowString {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        Map<Character,Integer> h = new HashMap<>();
        
        for(char ch : t.toCharArray()){
            h.put(ch , h.getOrDefault(ch, 0)+1);
        }

        int i=0,j=0,count = h.size() , ans=Integer.MAX_VALUE;
        String st = "";

        while (j<s.length()) {
            char ch = s.charAt(j);
            if(!h.containsKey(ch)){
                j++;
                continue;
            }
            else if(h.containsKey(ch)){
                h.put(ch, h.get(ch)-1);
                if(h.get(ch)==0) count--;
            }

            if(count==0){
                st = s.substring(i, j+1);
                ans = Math.min(ans, j-i+1);

                while (count==0) {
                    char c = s.charAt(i);
                    if(!h.containsKey(c)) i++;
                    else{
                        h.put(c, h.get(c)+1);
                        if(h.get(c)  > 0) count++;

                        i++;
                    }
                    if(count==0){
                        st = s.substring(i, j+1);
                        ans = Math.min(ans, j-i+1);
                    }
                }
            }
            j++;
        }
        System.out.println(ans);
        System.out.println(st);
    }
}
