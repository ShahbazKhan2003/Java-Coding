import java.util.*;
public class LongestSubWith0Sum {
    public static void main(String[] args) {
        int a[]={1,-1,3,2,-2,-8,1,7,10,23};

        Map<Integer,Integer> h = new HashMap<>();
        int ans = 0;
        
        int sum =0;

        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum==0) ans = i+1;

            else{
                if(h.containsKey(sum)){
                    ans = Math.max(ans , i - h.get(sum));
                }
                else h.put(sum, i);
            }
        }
        System.out.println(ans);
    }
}
