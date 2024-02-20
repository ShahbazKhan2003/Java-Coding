import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class QInputStirng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        ArrayList<Integer> arr = new ArrayList<>();
        int input;
        while (sc.hasNextInt()) {
            arr.add(sc.nextInt());
        }

        StringBuilder sb = new StringBuilder(s);
        
        for (int i = 0; i < arr.size(); i++) {
            int index = arr.get(i);
            sb.insert(index+i, '*');

        }
        System.out.println(sb);
    }
}
