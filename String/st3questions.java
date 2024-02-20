import java.util.*;

public class st3questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1st question
        // String s = sc.nextLine();
        // String st ="";

        // int n = s.length();

        // for(int i=0;i<n;i++)
        // {
        // int j =i+1;
        // char ch = s.charAt(i);
        // int m = ch;
        // st = st + j + ch;
        // st = st + m;
        // }
        // System.out.println(st);

        // 2nd leetcode FizzBuzz
        int n = 15;
        String[] arr = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) arr[i-1] = "FizzBuzz";

            else if (i % 3 == 0) arr[i-1] = "Fizz";

            else if (i % 5 == 0) arr[i-1] = "Buzz";

            else arr[i-1] = Integer.toString(i);
        }
        for(String j : arr)
        {
            System.out.print(j+" ");
        }

    }
}
