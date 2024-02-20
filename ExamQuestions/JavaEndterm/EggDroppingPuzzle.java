public class EggDroppingPuzzle {
    public static void main(String[] args) {
        int egg = 2, floor = 6;
        int dp[] = new int[egg + 1];
        int m;
        for (m = 0; dp[egg] < floor; m++) {
            for (int x = egg; x > 0; x--) {
                dp[x] += 1 + dp[x - 1];
            }
        }
        System.out.println(m);
    }
}
    
