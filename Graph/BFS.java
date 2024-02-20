import java.util.*;

public class BFS {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();        
        adj.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        adj.add(new ArrayList<>());
        adj.add(new ArrayList<>(Collections.singletonList(4)));
        adj.add(new ArrayList<>());
        adj.add(new ArrayList<>());
        // adj =  {{1,2,3} , {} , {4} , {} ,{}} ;

        int v = 5;

        boolean[] vist = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        vist[0] = true;
        q.add(0);

        while (!q.isEmpty()) {
            int val = q.poll();
            ans.add(val);
            for(var i : adj.get(val)){
                if(vist[i] == false){
                    vist[i] = true;
                    q.add(i);
                }
            }
        }

        System.out.println(ans);
    }
}
