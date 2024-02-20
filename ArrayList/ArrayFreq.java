import java.util.*;
public class ArrayFreq {
    public static void main(String[] args) {
        String str = "shahbazkhan";
        int arr[] = new int[26];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int idx = ch - 97;
            arr[idx]++;
        }

        for(int i=0;i<arr.length;i++){
            char ch = (char) (i+97);
            if(arr[i] > 0) {
                System.out.println(ch + "->" +arr[i]);
            }
        }
     
    }
}
