import java.util.*;

public class PrintAllSub {
    static int count=0;
    public static void main(String[] args) {
        int[] arr = {3 , 1 ,2  };

        printAll(arr , 0 , new ArrayList<>());
        System.out.println(count);
    }
    public static void printAll(int[] arr , int idx , List<Integer> ans){
        if(idx >= arr.length){
            System.out.println(ans);
            count++;
            return;
        }

        ans.add(arr[idx]);
        printAll(arr, idx+1, ans);
        ans.remove(ans.size()-1);
        printAll(arr, idx+1, ans);
    }
}
