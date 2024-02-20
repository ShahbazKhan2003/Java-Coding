public class ClearNUpdate {
    public static void main(String[] args) {
//clear -- uss bit ko 0 krdena
        //1. BitMask 1<<pos
        //2. 2.AND with 1.NOT

        int n =5;
        int pos = 2;

        int mask = 1<<pos;

        int notand = (~(mask) & n);
        System.out.println(notand); 
       
        //Update -- means 0->1 and 1->0
        //0 banana hai - //1. BitMask 1<<pos         --clear
                        //2. 2.AND with 1.NOT

        //1 banana hai-- //1. BitMask 1<<postshift    --Set
                        //2. OR

        int k = 5;
        int posshift = 1;

        int make  = 1;
        
        int bitmask = 1<<posshift;

        if(make==1){
            int ans = (bitmask | k);
            System.out.println(ans);
        }
        else{
            int notandd = (~(bitmask) &n);
            System.out.println(notandd);

        }
       

    }
}
