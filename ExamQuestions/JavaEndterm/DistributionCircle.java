// package ExamQuestions.JavaEndterm;

public class DistributionCircle {
    public static void main(String[] args) {
        int n = 5;
        int m = 8;
        int k = 2;

        int ans = helper(n,m,k);
        System.out.println(ans);
    }
    public static int helper(int n,int m,int k){
        if(m<= (n-k+1)) return m+k-1;

        m = m-(n-k+1);

        if(m%n==0) return n;
        else return m%n;
    }
}
