public class Q_60GovindaNumber {
    public static void main(String[] args) {
        int n = 13;

        int n1 = n;

        int sum =0;
        while(n1!=0){
            int remain = n1%10;
            sum +=remain;
            n1 = n1/10;
        }
        int k = n;
        int factors = 0;
        int s1 = 0;
       for(int i=2;i<n;i++){
          while(k%i==0){
            s1+=i;
            k=k/i;
          }
       }   
       if(k>2) s1+=k;

       if(sum == s1) System.out.println("True");
       else System.out.println("False");
    }
}
