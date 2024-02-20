import java.util.*;

public class DistinctSubseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        long[] dp = new long[s.length()+1];
        dp[0] = 1;

        Map<Character,Integer> h = new HashMap<>();

        for(int i=1;i<dp.length;i++){
            dp[i] = 2*dp[i-1];
            if(h.containsKey(s.charAt(i-1))){
                int dup = h.get(s.charAt(i-1));
                dp[i]-=dp[dup-1]; 
            }
            h.put(s.charAt(i-1), i);
        }
        System.out.println(dp[s.length()]-1);
    }
}
