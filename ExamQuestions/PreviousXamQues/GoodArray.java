import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class GoodArray {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3};
        int s  = 2;
        for(int i=0;i<5;i++){
            HashSet<Integer> h = new HashSet<>();
            ArrayList<Integer> a = new ArrayList<>();
            for(int j=i;j<5;j++){
                a.add(arr[j]);
                h.add(arr[j]);
                if(h.size()==s) System.out.println(a);
                // if(h.size()>s) break;
            }
        }
    }
}
