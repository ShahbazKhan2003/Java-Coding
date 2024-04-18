public class Subsequence {
    public static void main(String[] args) {
        String s= "abb";
        boolean arr[] = new boolean[s.length()];
        sol(s,arr,"");
    }
    public static void sol(String str,boolean visited[],String ans){
        if(ans.length() == str.length()){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<str.length();i++){
            if(visited[i] == false){
                visited[i] = true;
                sol(str, visited, ans+str.charAt(i));
                visited[i] = false;
            }
        }
    }
}
