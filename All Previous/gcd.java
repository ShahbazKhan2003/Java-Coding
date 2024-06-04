public class gcd {
    
    public static void main(String[] args) {
        int divisor = 34;
        int dividend = 60;
       
        while(dividend%divisor!=0)
        {
            int remain=dividend%divisor;
            dividend=divisor;
            divisor=remain;
        }
        // System.out.println(divisor);
//Using Recursion
        int a = 34;
        int b = 60;
        int gcd = gcdd(a, b);
        System.out.println(gcd);

        int lcm = a*b/gcd;
        System.out.println(lcm);
    }
    public static int gcdd(int a ,int b){
        if(b==0) return a;
        return gcdd(b,a%b);
    }

}
