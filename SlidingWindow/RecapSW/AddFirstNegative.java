import java.util.*;

public class AddFirstNegative {
    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;

        Queue<Integer> l = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        int st = 0;
        int end = 0;

        while(end < arr.length){
            if(arr[end] < 0){
                l.add(arr[end]);
            }

            if(end - st + 1 < k) end++;

            else if(end - st + 1 == k){
                if(l.size()==0) ans.add(0);
                else{
                    ans.add(l.peek());
                    if(arr[st] == l.peek()) l.poll();
                } 
                st++;
                end++;
            }
        }
        System.out.println(ans);
    }
}
