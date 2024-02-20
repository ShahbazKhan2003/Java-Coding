import java.util.Scanner;

public class Q67_BinaryPailndrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();

        int count  = 0;
        int i = 1;
        while(true){

            String s = Integer.toBinaryString(i);
            if(check(s)==true){
                System.out.println(s);
                count++;
                if(count==n){
                    System.out.println(i);
                    break;
                }
            }
            i++;
        }



    }
    public static boolean check(String s){
        int st = 0;
        int e = s.length()-1;

        while(st<=e){
            if(s.charAt(st) == s.charAt(e)){
                st++;
                e--;
            }
            else return false;
        }
        return true;
    }

}
