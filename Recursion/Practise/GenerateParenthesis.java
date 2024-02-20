import java.util.ArrayList;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<String> arr = new ArrayList<>();
        helper(n,n,arr,"");
        System.out.println(arr);
    }
    public static void helper(int ob,int cb,ArrayList<String> arr,String s){
        if(ob==0 && cb==0){
            arr.add(s);
            return;
        }
        if(ob == cb) helper(ob-1, cb, arr, s + "(");

        else{
            if(ob > 0) helper(ob-1, cb, arr, s + "(");
            if(cb > 0) helper(ob, cb-1, arr, s + ")");
        }
    }
}
