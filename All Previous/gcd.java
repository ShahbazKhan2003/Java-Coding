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
        System.out.println(gcdd(a,b));
    }
    public static int gcdd(int a ,int b){
        if(b==0) return a;
        return gcdd(b,a%b);
    }

}
