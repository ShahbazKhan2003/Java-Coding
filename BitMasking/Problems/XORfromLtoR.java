
public class XORfromLtoR {
    public static void main(String[] args) {
        int l = 3;
        int r = 6;
        
        //brute force 
        int ans = 0 ;
        for(int i=l;i<=r;i++){
            ans = ans ^ i;
        }
        System.out.println(ans);

        //optimal
        //3 ^ 4 ^ 5 ^ 6
        // (I)  1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6  i know its = 7
        //(II)  1 ^ 2
        // if( I - II ) == ans; 


         int n =0;
         if(r%4==0) n = r; 
         else if(r%4==1) n = 1; 
         else if(r%4==2) n = r+1; 
         else if(r%4==3) n = 0; 

         int k =0;
         l = l-1;

         if(l%4==0) k = l; 
         else if(l%4==1) k = 1; 
         else if(l%4==2) k = l+1; 
         else if(l%4==3) k = 0; 
         int full_range =  n;
         int half_range =  k;
         
         int ans1 = full_range ^ half_range;
         System.out.println(ans1);
    }
}
