import java.util.*;
public class SlidingWIndowMaximum {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        
        LinkedList<Integer> li = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        int st=0,end=0;

        while(end < arr.length){

            while(li.size()>0 && li.getLast() < arr[end]) li.removeLast();

            li.addLast(arr[end]);

            if(end - st + 1 < k) end++;

            else if(end - st + 1 == k){
                ans.add(li.getFirst());
                if(li.getFirst() == arr[st]) li.removeFirst();
                st++;
                end++;
            }
        }
        System.out.println(ans);
    }
}
