import java.util.*;

public class TopKfrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        Map<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<n;i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i] , h.get(arr[i]) + 1);
            }
            else{
                h.put(arr[i],1);
            }
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->{
            return b.getValue() - a.getValue();
        });

        pq.addAll(h.entrySet());
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = pq.remove().getKey();
        }
        System.out.println(Arrays.toString(ans));
    }
}
