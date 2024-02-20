// package ExamQuestions.JavaEndterm;

public class PrimeNUmber {
    public static void main(String[] args) {
        int n = 50;

        if(n<=1) System.out.println("NOt a prime");
        int c =0;
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                c++;
                break;
            }
            
        }
        if(c==0) System.out.println("Prime");
        else System.out.println("Not Prime");

    }
}
