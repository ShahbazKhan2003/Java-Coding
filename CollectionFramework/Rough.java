import java.util.*;

public class Rough {
    public static void main(String[] args) {
        int[] arr = {4,3,1,1,3,3,2};
        int k = 3;
        TreeMap<Integer,Integer> h = new TreeMap<>();
        for(int i=0;i<arr.length;i++) h.put(arr[i] , h.getOrDefault(arr[i],0)+1);
        // if(k==0) return h.size();

        // h.remove(4);
        
        
        for(var it:h.entrySet()){
            int rep = it.getValue();
            int node = it.getKey();
            // System.out.println(rep);
            if(k==0) break;
            if(rep>0){
                h.put(node,rep-1);
                if(rep-1 == 0) h.remove(node);
            }
        }
       
        System.out.println(h.size());
    }
}
