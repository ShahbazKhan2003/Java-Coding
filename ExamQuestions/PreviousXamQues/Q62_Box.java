import java.util.Scanner;

public class Q62_Box {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int left = 0;
//FirstIndexCheck
        if (arr[0] % 2 == 0) {
            count += arr[0] / 2;
        }
        if (arr[0] % 2 != 0) {
            count += (arr[0] - 1) / 2;
        }
        if (arr[0] % 2 != 0 && arr[1] % 2 != 0) {
            left += 1;
        }
//Mid check
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] % 2 == 0) {
                count += arr[i] / 2;
            }
            if (arr[i] % 2 != 0) {
                count += (arr[i] - 1) / 2;
            }
            if ((arr[i]%2 !=0 && arr[i + 1]%2 !=0) || arr[i - 1] % 2 != 0) {
                left += 1;
            }
            // System.out.println(count);

        }
//LastIndexCheck
        if (arr[arr.length - 1] % 2 == 0) {
            count += arr[arr.length - 1] / 2;
        }
        if (arr[arr.length - 1] % 2 != 0) {
            count += (arr[arr.length - 1] - 1) / 2;
        }
        if (arr[arr.length - 1] % 2 != 0 && arr[arr.length - 2] % 2 != 0) {
            left += 1;
        }
//Left Check
        if (left % 2 == 0) {
            count += left / 2;
        } else {
            count += (left - 1) / 2;
        }
        System.out.println(count);
    }
}
