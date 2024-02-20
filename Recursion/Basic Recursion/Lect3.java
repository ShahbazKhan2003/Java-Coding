public class Lect3 {
//     public static void main(String[] args) {
//         int n = 51;
        
//         System.out.println(sum(n)); 
        
//         System.out.println(count(n));
        
//     }
// //Sum of digits
//     public static int sum(int n)
//     {
//         //Base case
//         if(n >= 0 && n <= 9) return n;

//         //Sub prob
//         int smallans = sum(n/10);

//         //Self work
//         return smallans + n%10;
        
//     }

// //Count no of Digits
//     public static int count(int n)
//     {
//         if(n >=0 && n <=9) return 1;

//         int ans = count(n/10);

//         return ans+1;
//     }

public static void main(String[] args) {
    //Power of Number 
    int  p = 2;
    int q = 4;
    System.out.println(pow(p,q));

    System.out.println(pow1(p, q));
}
public static int pow(int p , int q)
{
    //Frst Method
    if(q == 0) return 1;

    int ans = pow(p, q-1);

    return ans*p;
}
public static int pow1(int p, int q)
{
    //2nd Method
    if(q == 0) return 1;
    
    int ans = pow(p,q/2);
    if(q%2 == 0)
    {
        return ans*ans;
    }
    else
    {
        return ans*ans*p;
    }
}
}