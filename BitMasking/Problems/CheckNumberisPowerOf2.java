public class CheckNumberisPowerOf2 {
    public static void main(String[] args) {
        int n = 5;
        int mask = n & (n-1);
        if(mask==0) System.out.println("Power of 2");
        else System.out.println("Not power of 2");
    }
}
