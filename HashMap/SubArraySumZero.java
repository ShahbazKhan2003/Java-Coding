import java.util.HashMap;

public class SubArraySumZero {
    public static void main(String[] args) {
        int arr[] = {};
        int n = arr.length;
        
        HashMap<Integer,Integer> h = new HashMap<>();

        int maxlen = 0, prefixSum =0;
        h.put(0, -1);
        for(int i=0;i<n;i++){
            prefixSum+=arr[i];
            if(h.containsKey(prefixSum)){
                maxlen = Math.max(maxlen, i - h.get(prefixSum));
            }
            else{
                h.put(prefixSum, i);
            }
        }

        System.out.println(maxlen);
    }
}

