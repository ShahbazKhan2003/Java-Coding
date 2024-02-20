import java.util.*;
public class nextpermutation {
    public static void reverse(int arr)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int p = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                p = i;
                break;
            }
        }
        System.out.println(p);
        int q = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[p] < arr[i]) {
                q = i;
                break;
            }
        }
        System.out.println(q);
    }
}
