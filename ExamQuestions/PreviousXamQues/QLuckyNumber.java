public class QLuckyNumber{
    public static void main(String[] args) {
        int n = 1;
        int st = n;
        int digits = (int)Math.log10(n)+1;
        System.out.println(digits);
        int sum =0;

        for(int i=0;i<digits;i++){
            int num = n%10;
             sum = sum + (int)Math.pow(num,digits);
            n = n/10;
        }
        if(st == sum) System.out.println("True");
        else System.out.println("False");


    }
}