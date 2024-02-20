import java.util.*;
public class FindConsecutive{
    public static void main(String[] args) {

        int[] arr = {0,3,7,2,5,8,4,6,0,1};

        HashSet<Integer> st = new HashSet<>();

        for(int i=0;i<arr.length;i++) st.add(arr[i]);

        int maxi =0;

        for(int i:st){
            if(!st.contains(i-1)){
                int curr = i;
                int count = 1;
                while(st.contains(curr+1)){
                    curr++;
                    count++;
                }
                maxi = Math.max(maxi,count);
            }
        }
        System.out.println(maxi);
    }
}