import java.util.Scanner;

public class Lect2 {
    public static void main(String[] args) {
//Magixc num 5,25,30,125,130
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int ans=0;
        // int mul=5;

        // while(n!=0)
        // {
        //     int n1=n&1;
        //     if(n1==1)
        //     {
        //         ans+=mul;
        //     }
        //     mul*=5;

        //     n=n>>1;
        // }
        // System.out.println(ans);

//Subsequence of String
     String s="abc";
     int total  = 1<<s.length();
     for(int i=0;i<total;i++)
     {
        int pos=0;
        int n=i;
        while(n!=0)
        {
            int mask=n&1;
            if(mask!=0)
            {
                System.out.print(s.charAt(pos));
            }
            pos++;
            n>>=1;
        }
        System.out.println();
     }

    }
}
