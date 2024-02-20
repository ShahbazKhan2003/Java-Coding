public class Lect4 {
    //Print K multiples

//     public static void main(String[] args) {
//       int num = 3;
//       int k = 4;
//       kmultiple(num,k);
//     }
//     public static void kmultiple(int num,int k)
//     {
//         if(k == 0) 
//         {
//             // System.out.println(num);
//             return ;
//         }
//         kmultiple(num, k-1);
//         System.out.println(num*k);

//     }

//Sum of natural number
    //    public static void main(String[] args) {
    //        int n = 5;
    //        System.out.println(sum(n));
    //    }
    //    public static int sum(int n)
    //    {
    //        if(n == 0) return 0;

    //        int ans = sum(n-1);

    //        return ans+n;
    //    }

// Sum of alternate sign number to n
          public static void main(String[] args) {
             int n = 4;
             System.out.println(alt(n));
          } 
          public static int alt(int n)
          {
            if(n == 0) return 0;

            int ans = alt(n-1);

            if(n%2 == 0) return ans-n;

            else return ans+n;
          }
}
