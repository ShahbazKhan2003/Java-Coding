public class Q70_CountBit{
    public static void main(String[] args) {
         int n = 10;
         int count = 0;

         for(int i=0;i<=n;i++){
            count+=Integer.bitCount(i);
         }
         System.out.println(count);
    }
}