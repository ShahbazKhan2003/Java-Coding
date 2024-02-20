import java.util.HashMap;
import java.util.TreeMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int n = arr.length;
        int tar = 9;
        
        HashMap<Integer,Integer> h = new HashMap<>();
       int a =-1;
       int b =-1;
        for(int i=0;i<n;i++){
            int diff = tar - arr[i];
            if(h.containsKey(diff)){
                b = i;
                a = h.get(diff);
            }
            else h.put(arr[i], i);
        }

        System.out.println(a);
        System.out.println(b);
    }
    
}
