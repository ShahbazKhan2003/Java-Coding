import java.util.Scanner;

public class Q63_SmallNUmDIv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=1;i<n*m;i++){
            if(i%n==0 && i%m==0){
                System.out.println(i);
                break;
            }
        }
    }
}
