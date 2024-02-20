import java.util.*;
public class RemoveDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        LinkedHashSet<Character> h = new LinkedHashSet<>();

        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
            h.add(ch);
        }
        System.out.println(h);
        String ans ="";
        for(Character i: h){
            ans = ans+i;
        }
        System.out.println(ans);
    }
}
