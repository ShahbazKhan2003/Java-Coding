import java.util.*;
public class ProblemsFindingGoodstring {
    public static void main(String[] args) {
        // Good String(contain a,e,i,o,u)

        String st = "abcie";

        int ans =0;
        int count =0;
        for(int i=0;i<st.length();i++)
        {
            char ch1= st.charAt(i);
            if(ch1 == 'a' || ch1== 'e' || ch1== 'i'|| ch1== 'o' ||ch1== 'u')
            {
                count++;
            }
            else
            {
                ans = Math.max(ans, count);
                count=0;
            }
        }
        ans = Math.max(ans, count);

        System.out.println(ans);


        // int ans = checkstring(st);
        // System.out.println(ans);
    }
//2nd Method

    // public static int checkstring(String st) {
    //     int max=0;
    //     for (int i = 0; i < st.length(); i++) {
    //         for (int j = i + 1; j <= st.length(); j++) {
    //             String s = st.substring(i, j);
    //             int value=checkgood(s);
    //             if(max<value)
    //             {
    //                 max=value;
    //             }
    //         }
    //     }
    //     return max;
    // }

    // public static int checkgood(String s)
    // {
    //     int n = s.length();
    //     int count=0;
    //     for(int i=0;i<n;i++)
    //     {
    //         char ch1= s.charAt(i);
    //         if(ch1 == 'a' || ch1== 'e' || ch1== 'i'|| ch1== 'o' ||ch1== 'u')
    //         {
    //             count++;
    //         }
    //         else
    //         {
    //             break;
    //         }
            
    //     }

    //     return count;
    // }
}
