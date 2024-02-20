public class BinaryTODecimal {
    public static void main(String[] args) {
        int m = 1001;
        String s = Integer.toString(m);
        System.out.println(s);

        int ans = Integer.parseInt(s,2);
        System.out.println(ans);
    }
}
