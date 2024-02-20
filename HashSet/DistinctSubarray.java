import java.util.*;

public class DistinctSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        HashSet<Integer> hs = new HashSet<>();
        int j = 0, ans = 0;
        
        for (int i = 0; i < n; i++) {
            while (j < n && !hs.contains(arr[j])) {
                hs.add(arr[j]);
                j++;
            }
            ans += ((j - i) * (j - i + 1)) / 2;
            hs.remove(arr[i]);
        }
        System.out.println(ans);
    }
}
