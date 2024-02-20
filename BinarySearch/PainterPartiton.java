import java.util.*;

public class PainterPartiton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        while (sc.hasNextInt()) {
            arr.add(sc.nextInt());
        }
        int k = 2;
        int s = 0;
        int e = 0;
        for (int i = 0; i < arr.size(); i++) {
            e += arr.get(i);
        }

        int ans = 0;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (ispossible(arr, arr.size(), k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static boolean ispossible(ArrayList<Integer> arr, int n, int k, int mid) {
        int paintercount = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum + arr.get(i) <= mid)
                sum += arr.get(i);

            else {
                paintercount++;

                if (paintercount > k || arr.get(i) > mid)
                    return false;

                sum = arr.get(i);
            }
        }
        return true;
    }
}
