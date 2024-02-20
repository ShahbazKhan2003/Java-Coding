import java.util.*;
public class ShopNCandy{
    public static void main(String[] args) {
        int cand[] = {3,2,1,4};
        Integer candies[] = new Integer[cand.length];
        for(int i=0;i<cand.length;i++) candies[i] = cand[i] ;

        
	    int k = 2;
	    int N = candies.length;
		 int min = 0;
        int max = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(candies);
        int i=0;
        int n = N;
        while(i<n){
            min+=candies[i];
            i++;
            n=n-k;
        }
        n = N;
        System.out.println(min);
        Arrays.sort(candies, (a, b) ->{
            return b - a;
        });

        i=0;
        while(i<n){
            max += candies[i];
            i++;
            n=n-k;
        }
        ans.add(min);
        ans.add(max);
        System.out.println(ans);
    }
}