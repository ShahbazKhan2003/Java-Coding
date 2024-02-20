
import java.util.Scanner;

public class maxfreq {
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            // int count[] = new int[256];
            // int len = str.length();
            // for(int i=0;i<len;i++)
            // {
            //     count[str.charAt(i)]++;
            // }
            
            // int max=-1;
            // char result = ' ';
            // for(int i=0;i<len;i++)
            // {
            //     if(max < count[str.charAt(i)])
            //     {
            //         max = count[str.charAt(i)];
            //         result = str.charAt(i);
            //     }
            // }

            // System.out.println(result);
            String name = "Khaaannn";
            int[] count = new int[256];
            char ch = ' ';
            int len = name.length();
            for(int i=0;i<len;i++)
            {
                count[name.charAt(i)]++;
            }
            int max = -1;
            for(int i=0;i<len;i++)
            {
                if(max < count[name.charAt(i)])
                {
                    max = count[name.charAt(i)];
                    ch = name.charAt(i);
                }
            }
            System.out.println(ch);
    }
}
