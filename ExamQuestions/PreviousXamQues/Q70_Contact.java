import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q70_Contact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<String>> li = new ArrayList<>();

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            List<String> lk = new ArrayList<>();
            for(int j=0;j<3;j++){
                String input = sc.next();
                lk.add(input);
            }
            li.add(lk);
        }

        String check = sc.next();

        for(int i=0;i<n;i++){
            List<String> fi = li.get(i);
            if(fi.get(0).equals(check)){
                System.out.println(fi);
            }
        }
    }
}
