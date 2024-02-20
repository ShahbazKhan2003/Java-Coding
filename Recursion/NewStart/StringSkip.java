
public class StringSkip {
    public static void main(String[] args) {
        String s = "baccad";
        //Solving with 2 arguments
        // String ans = helper(s,"",0);
        // System.out.println(ans);

        //SOlving with 1 args
        // String ans  = helper(s);
        // System.out.println(ans);
        //Remove a word
        String word = "bcdappledfg";
        String ans = helperapp(word);
        System.out.println(ans);

        System.out.println(skipappnotapple("abcappfgapplegh"));
    }    
    public static String helper(String s, String ans,int i){
        if(i == s.length()) return ans;

        if(s.charAt(i) != 'a') ans = ans + s.charAt(i);

         return helper(s, ans, i+1);
    }

    //1 args wala
    public static String helper(String s){
        if(s.length()==0) return "";
        char store1st = s.charAt(0);
        String restofall = s.substring(1);

        if(s.charAt(0) !='a') return store1st + helper(restofall);
        else return helper(restofall);
    }
    public static String helperapp(String s){
        if(s.length() == 0) return "";

        if(s.startsWith("apple")){
            return helperapp(s.substring(5));
        }
        else return s.charAt(0) + helperapp(s.substring(1));
    }
    public static String skipappnotapple(String s){
        if(s.length()==0) return "";

        if(s.startsWith("app") && !s.startsWith("apple")) return skipappnotapple(s.substring(3));

        else return s.charAt(0) + skipappnotapple(s.substring(1));
    }
}
