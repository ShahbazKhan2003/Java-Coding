public class ClearIthBit {
    public static void main(String[] args) {
        int n = 13;
        int ith = 2;

        int mask = 1 << ith;
        // System.out.println(mask);

        int val = (~(mask) & n);
        System.out.println(val);

        //Remove last set bit
        remlast(13);
    }
    public static void remlast(int n){
        int ans = n & (n-1);
        System.out.println(ans);
    }
}
