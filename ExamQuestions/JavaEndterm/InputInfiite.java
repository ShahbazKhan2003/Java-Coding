import java.util.*;;
public class InputInfiite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while(sc.hasNextInt()){
            int a = sc.nextInt();
            max= Math.max(max, a);
        }
        System.out.println(max);
    }
}
