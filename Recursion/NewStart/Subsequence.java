

public class Subsequence {
    public static void main(String[] args) {
        subseq("","aa");        
    }
    public static void subseq(String p,String up){
        if(up.length()==0){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        //2 calls, 1.Taken 1st ele 2. Skip 1st ele
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1))  ;
    }
}
