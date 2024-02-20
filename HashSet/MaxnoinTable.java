import java.util.*;
public class MaxnoinTable {
    public static void main(String[] args) {
        int[] arr = {2,1,1,3,2,3};
        HashSet<Integer> st = new HashSet<>();

        int max = 0;
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            if(st.contains(num)) st.remove(num);

            else{
                st.add(num);
                max = Math.max(max, st.size());
            }
        }
        System.out.println(max);
    }
}
