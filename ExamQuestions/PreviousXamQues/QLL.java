import java.util.Scanner;

public class QLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }

        String com = sc.next();

        for(int i=0;i<n;i++){
            if(arr[i].compareTo(com) > 0){
                System.out.println(arr[i]);
            }
        }

    }
}
