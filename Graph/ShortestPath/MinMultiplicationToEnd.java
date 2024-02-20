import java.util.*;
class Pair{
    int first , second;
    public Pair(int f , int s){
        first = f;
        second = s;
    }
}
public class MinMultiplicationToEnd {
    public static void main(String[] args) {
        int arr[] = {3, 4, 65};
        int start = 7; 
        int end = 66175;

        int mod = 100000;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start , 0));
        
        int[] dis = new int[mod];
        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[start] = 0;

        while(!q.isEmpty()){
            Pair pp = q.remove();
            int node = pp.first;
            int step = pp.second;

            for(int i=0;i<arr.length;i++){
                int num = (arr[i] * node ) % mod;
                if(step + 1 < dis[num]){
                    dis[num] = step +  1;
                    if(num == end) System.err.println(step+1);
                    q.add(new Pair(num , step + 1));
                }
            }
        }
        // System.out.println(-1);


    }
}
