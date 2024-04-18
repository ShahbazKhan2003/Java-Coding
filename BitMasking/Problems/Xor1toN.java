// package Problems;

public class Xor1toN {
    public static void main(String[] args) {
        int n = 18;
        
        //brute force 
        int ans = 0;
        for(int i=1;i<=n;i++){
            ans = ans ^ i;
        }
        System.out.println(ans);

        //Optimal
        //n%4==0 = n
        //n%4==1 = 1
        //n%4==2 = n+1
        //n%4==3 = 0
        if(n%4==0) System.out.println(n);
        else if(n%4==1) System.out.println(1);
        else if(n%4==2) System.out.println(n+1);
        else if(n%4==3) System.out.println(0);
    }
}
