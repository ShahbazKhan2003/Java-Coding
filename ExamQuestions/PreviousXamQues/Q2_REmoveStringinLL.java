import java.lang.reflect.Array;
import java.util.*;

public class Q2_REmoveStringinLL {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String input;
        ArrayList<String> arr = new ArrayList<>();
        while(true){
            input = sc.nextLine();
            if(input.equals("-1")) break;
            arr.add(input);
        }
        // System.out.println(arr);
        String com = sc.nextLine();

        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(com.compareTo(arr.get(i)) < 0){
                ans.add(arr.get(i));
            }
        }
        System.out.println(ans);

    }
}
