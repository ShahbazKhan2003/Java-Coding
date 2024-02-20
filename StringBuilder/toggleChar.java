import java.util.Scanner;

import java.util.*;
public class toggleChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder st = new StringBuilder(sc.nextLine());

        for(int i=0;i<st.length();i++)
        {
            boolean flag = true; //if Capital alpha
            char ch = st.charAt(i);
            if(ch == ' ') continue;
            int asci = (int) ch;
            if(asci>=97) flag=false;  //Small Alpha
            if(flag == true)
            {
                asci+=32;
                char dh = (char)asci;
                st.setCharAt(i, dh);
            }
            else
            {
                asci-=32;
                char dh =(char)asci;
                st.setCharAt(i, dh);
            }
        }

        System.out.println(st);
    }
}
