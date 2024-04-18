public class SetBit {
    public static void main(String[] args) {
        int n = 13;
        int ith = 1;

        int mask = 1<<ith;
        // System.out.println(mask);
        int val = n  | mask;
        System.out.println(val);
    }
}
