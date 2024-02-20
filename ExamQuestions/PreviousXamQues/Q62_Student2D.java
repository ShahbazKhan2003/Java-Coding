import java.util.Scanner;

public class Q62_Student2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] key  = {"D", "B", "D", "C", "C", "D", "A", "E", "A","D"};

        int n = sc.nextInt();

        String[][] arr = new String[n][10];

        for(int i=0;i<n;i++){
            for(int j=0;j<10;j++){
                arr[i][j] = sc.next();
            }
        }

        for(int i=0;i<n;i++){
            int count =0;
            for(int j =0;j<10;j++){
                if(arr[i][j].equals(key[j])) count++;
            }
            System.out.println(count);
        }
    }
}
