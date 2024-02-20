import java.util.*;

public class SubsetP {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<ArrayList<Integer>> store = new ArrayList<>();
        helper(arr,a,0,store);
        System.out.println(store);
    }
    public static void helper(int[] arr,ArrayList<Integer> a,int i, ArrayList<ArrayList<Integer>> store){
        if(i>=arr.length){
            store.addLast(new ArrayList<>(a));
            return;
        }
        a.add(arr[i]);
        helper(arr, a, i+1,store);
        a.remove(a.size()-1);
        helper(arr, a, i+1,store);
    }
}
