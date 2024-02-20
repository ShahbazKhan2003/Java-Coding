import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int m = 3;
        ArrayList<String> arr = getPath(1 , 1 , n , m);
        System.out.println(arr);
    }
    public static ArrayList<String> getPath(int sr,int sc,int n,int m){
        if(sr == n && sc ==m){
            ArrayList<String> end = new ArrayList<>();
            end.add("");
            return end;
        }

        ArrayList<String> hpath = new ArrayList<>();
        ArrayList<String> vpath = new ArrayList<>();

        if(sc<m){
            hpath = getPath(sr, sc+1, n, m);
        }
        if(sr<n){
            vpath = getPath(sr+1, sc, n, m);
        }

        ArrayList<String> ans = new ArrayList<>();
        for(String i: hpath){
            ans.add("h" + i);
        }
        for(String i: vpath){
            ans.add("v" + i);
        }
        return ans;
    }

}
