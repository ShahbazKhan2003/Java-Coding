import java.util.Scanner;

public class QSearchInSong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
        String s = sc.next();
        int i;
        for( i=0;i<n;i++){
            if(arr[i].equals(s)){
                System.out.println("yes");
                break;
            }
        }
        if(i>=n) System.out.println("No"); 
    }
}
