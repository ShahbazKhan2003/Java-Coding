import java.util.*;

public class Q10_StringIntact {
    public static void main(String[] args) {
        String s = "piv   kig";
        char[] arr = s.toCharArray();
        char[] res = new char[arr.length];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] ==' '){
                 res[i] = ' ';
            }
        }
        
        int j = arr.length-1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] != ' '){
                while(res[j] == ' ') j--;
                
                res[j] = arr[i];
                j--;    
            }
        }
        String ans = new String(res);
        System.out.println(res);
       
    }
}
