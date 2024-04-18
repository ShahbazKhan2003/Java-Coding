import java.util.*;
public class CountAnagram {
    public static void main(String[] args) {
        String txt = "aabaabaa";
        String pat = "aaba";

        Map<Character,Integer> h = new HashMap<>();
        for(char ch:pat.toCharArray()){
            h.put(ch, h.getOrDefault(ch,0)+1);
        }
        int count = h.size();

        int st=0,end=0;
        int ans = 0;

        while(end < txt.length()){
            char ch  =  txt.charAt(end);
            if(h.containsKey(ch)){
                h.put(ch,h.get(ch)-1);
                if(h.get(ch)==0){
                    count--;
                }
            }

            if(end - st + 1 < pat.length()) end++;

            else{
                if(count==0){
                    ans++;
                }
                char chi = txt.charAt(st);
                if(h.containsKey(chi)){
                    h.put(chi , h.get(chi)+1);
                    if(h.get(chi)==1) count++;
                }
                st++;
                end++;
            }
        }
        System.out.println(ans );
    }
}
