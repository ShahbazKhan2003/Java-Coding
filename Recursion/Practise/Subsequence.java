
public class Subsequence {
    public static void main(String[] args) {
        String s = "cba";
        subse(s,0,"");     
    }
    public static void subse(String s,int i,String store){
        if(i>=s.length()){
            System.out.println(store);
            return;
        }
       
        subse(s, i+1, store);
        subse(s, i+1,s.charAt(i)+store);
        
    }
}
