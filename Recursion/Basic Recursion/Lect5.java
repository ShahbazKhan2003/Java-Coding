public class Lect5 {
    public static int itergcd(int x,int y)
    {
        while(y%x != 0)
       {
          int a = y%x;
          y = x;
          x = a;
       }
       return x;
    }
    public static void main(String[] args) {
//GCD (while loop se)
       int x = 16;
       int y = 12;
       System.out.println(itergcd(x,y));

       System.out.println(recurgcd(x,y));

       //For lcm formula is  lcm = (x*y)/gcd

       int lcm  = x*y/recurgcd(x, y);
       System.out.println(lcm);
      
    }
//Recursion
    public static int recurgcd(int x,int y)
    {
        if(y == 0) return x;

        return recurgcd(y , x%y );
    }

}
