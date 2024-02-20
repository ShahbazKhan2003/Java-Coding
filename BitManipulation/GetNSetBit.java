public class GetNSetBit {
    public static void main(String[] args) {
        int n =5;
        int postshift = 2;
//Get--either one or zero
        //1. BitMask -- 1<<posshift
        //2. AND

        int BitMask = 1<<postshift;

        if((BitMask&n) ==0) System.out.println("bit is zerop");
        
        else System.out.println("Bit is one");

//Set -- bit ko 1 krdena
        //1. BitMask 1<<postshift
        //2. OR

        int k = 5;
        int shift = 1;

        int mask =  1<<shift;

        int ans = k | mask;
        System.out.println(ans);
    }
}
