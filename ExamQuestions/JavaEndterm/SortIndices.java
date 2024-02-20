import java.util.*;

public class SortIndices {
    public static void main(String[] args) {
        // int[] arr = {2,6,4,8,2,6};
        // Map<Integer,List<Integer>> h = new HashMap<>();
        
        // for(int i=0;i<arr.length;i++){
        //     if(h.containsKey(arr[i])){
        //         h.get(arr[i]).add(i);
        //     }
        //     else{
        //         h.put(arr[i],new ArrayList<>());
        //         h.get(arr[i]).add(i);
        //     }
        // }
     
        // Arrays.sort(arr);
        
        // for(int i=arr.length-1;i>=0;i--){
        //    if(h.containsKey(arr[i])){
        //     List<Integer> ans = h.get(arr[i]);
        //     h.remove(arr[i]);
        //     for(int it:ans) System.out.print(it+" ");
        //    }
        // }


        //optimized 
        int[] arr = {2, 6, 4, 8, 2, 6};
        TreeMap<Integer, List<Integer>> h = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            h.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
        }

        for (var entry : h.entrySet()) {
            List<Integer> indices = entry.getValue();
            for (int it : indices) {
                System.out.print(it + " ");
            }
        }

    }
}
