public class Lect2 {
//     public static void main(String[] args) {
// // Factorial of num
//     int n = 5;
    
//     System.out.println(fact(n));
//     }
//     public static int fact(int n)
//     {
// // Base case
//         if(n == 0) return 1;

// // Sub Problem      
//     int fn = fact(n-1);

// // Self work
//     return fn*n;
//     }

    public static void main(String[] args) {
// Nth Fibonacci number

        int n = 4;
        // System.out.println(fib(n));

//Print all fibo series upto n
        for(int i=0;i<=n;i++)
        {
            System.out.print(fib(i)+" ");
        }
       
    }
    public static int fib(int n )
    {
        //Base case
        if(n == 0 || n == 1) return n;

        //Sub problem
        int prev = fib(n-1);
        int prevPrev = fib(n-2) ;

        //Self work
        return prev + prevPrev;
    }
}
