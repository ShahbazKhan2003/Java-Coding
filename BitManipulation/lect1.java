//RIght shift mie 2 se divide hota hai
//Left shift mie 2 se multiply hota hai

public class lect1 {
    public static void main(String[] args) {
        // System.out.println(5^5);

        // System.out.println(8>>1);
        // System.out.println(8<<1);
//Even and odd
        // int a=8;
        // int ans=a&1;
        // if(ans==0)
        // {
        //     System.out.println("even");
        // }
        // else
        // {
        //     System.out.println("Odd");
        // }
//Check its 4thpos is set or not
        //   int pos=4;
        //   a=a>>(pos-1);
        //   System.out.println(a);
        //   int rem=a&1;
        //   if(rem==1)
        //   {
        //     System.out.println("Set");
        //   }
        //   else
        //   {
        //     System.out.println("Unset");
        //   }


        //   int num=16;
        //   int place=4;

        //   int mask=1;
        //   mask=mask<<pos-1;
        //   System.out.println(mask);

        //   num=num|mask;
        //   System.out.println(num);

        int n=24;
        int count=0;
        // while(n!=0)
        // {
        //     int ans=n&1;
        //     if(ans==1)
        //     {
        //         count++;
        //     }
        //     n=n>>1;
        // }
        // System.out.println(count);

        while(n!=0)
        {
            int mask=n-1;
            n=n&mask;
            count++;
        }
        System.out.println(count);
    }
}
