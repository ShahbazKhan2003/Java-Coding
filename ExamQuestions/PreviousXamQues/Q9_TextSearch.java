import java.util.Scanner;

public class Q9_TextSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String tar = sc.nextLine();
        
        StringBuilder sb = new StringBuilder(s);
        
        while(true){
            int index = sb.indexOf(tar);

            if(index == -1){
                System.out.println(-1);
                break;
            }
            else{
                System.out.print(index+" ");
                int size = tar.length();
                for(int i=index;i<index+size;i++) sb.setCharAt(i, '.');
            }
        }
    }
}