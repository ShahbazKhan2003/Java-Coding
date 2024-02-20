import java.util.Scanner;

public class Q63_Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();

        if(n>=s.length()) System.out.println(-1);
        char ch = s.charAt(n);
        String ans = s.substring(0,n);
        ans = ch + ans;
        System.out.println(ans);
        
        StringBuilder sb = new StringBuilder(s.substring(0,n));
        sb.reverse();
        ans = sb.toString() + s.charAt(n);
        System.out.println(ans);
    }
}
