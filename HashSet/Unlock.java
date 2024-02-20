import java.util.*;

public class Unlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        List<Integer> arr = new ArrayList<>();
        Map<Integer, Integer> h = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            arr.add(x);
            h.put(arr.get(i), i);
        }
        int max = n;
        int it = 0;
        while(k>0 && it<n){
            if(arr.get(it) != max){
                int idx = h.get(max);
                h.put(arr.get(it) , idx);
                h.put(max, it);
                Collections.swap(arr, idx, it);
                k--;
            }
            it++;
            max--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
