import java.util.*;
public class Q61_String0n1R {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);
        if(sb.indexOf("10") !=-1|| sb.indexOf("00") !=-1){

            while(true){
                int idx = sb.indexOf("10");
                if(idx == -1) break;

                else{
                    sb.delete(idx, idx+2);
                }
            }
            while(true){
                int idx = sb.indexOf("00");
                if(idx == -1) break;

                else{
                    sb.delete(idx, idx+2);
                }
            }
            System.out.println(sb.length());
        }
        else System.out.println(s.length());
    }
}
