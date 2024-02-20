public class GenerateParenthesis {
    public static void main(String[] args) {
        sol(2,0,0,"");
    }
    public static void sol(int n,int ob,int cb,String ans){
        if(ob<cb || ob>n ||cb>n){
            return;
        }
        if(cb+ob==2*n){
            System.out.println(ans);
            return;
        }
        sol(n, ob+1, cb, ans+"(");
        sol(n, ob, cb+1, ans+")");
    }
}
