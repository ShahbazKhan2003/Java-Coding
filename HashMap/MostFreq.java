import java.util.*;
public class MostFreq {
    public static void main(String[] args) {
        int []arr = {1,3,2,1,4,1,3,3,3};
        HashMap<Integer,Integer> h = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(h.containsKey(arr[i])) h.put(arr[i], h.get(arr[i])+1);

            else {
                h.put(arr[i],1); 
            }
        }
        
        int max = Integer.MIN_VALUE;
        int key = -1;
// 1st Way
        // for(var i:h.entrySet()){
        //     if(i.getValue() > max){
        //         max = i.getValue();
        //         key = i.getKey();
        //     }
        // }

        for(var k: h.keySet()){
            if(h.get(k) > max){
                max = h.get(k);
                key = k;
            }
        }
        System.out.println(key);

    }
}
