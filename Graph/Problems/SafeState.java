import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SafeState {
    public static void main(String[] args) {
        int V = 5;
         // Your code here
        List<List<Integer>> rev = new ArrayList<>();
        for(int i=0;i<V;i++) rev.add(new ArrayList<>());
        int[] indeg = new int[V];
        for(int i=0;i<V;i++){
            for(int it:adj.get(i)){
                rev.get(it).add(i);
                indeg[i]++;
                
            }
        }
       
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indeg[i]==0) q.add(i);
        }
        
        List<Integer> sort = new ArrayList<>();
        while(!q.isEmpty()){
            int val = q.peek();
            q.remove();
            sort.add(val);
            for(int it:rev.get(val)){
                indeg[it]--;
                if(indeg[it]==0) q.add(it);
            }
        }
        Collections.sort(sort);
        return sort;
    }
}
