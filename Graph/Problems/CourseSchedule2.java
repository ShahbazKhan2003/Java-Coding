import java.util.*;
public class CourseSchedule2 {
    public static void main(String[] args) {
        int[][] prerequisites = {{1,0},{2,1},{3,2}};
        int n = 4;
        int p = 3;
        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        for(int i=0;i<p;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        int[] indeg = new int[n];
        for(int i=0;i<n;i++){
            for(var it:adj.get(i)){
                indeg[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indeg[i]==0) q.add(i);
        }
        int[] ans = new int[n];
        int i=0;
        while (!q.isEmpty()) {
            int val = q.remove();
            ans[i++] = val;
            for(var it:adj.get(val)){
                indeg[it]--;
                if(indeg[it]==0) q.add(it);
            }
        }
        if(i==n) System.out.println(Arrays.toString(ans));
        else System.out.println(new int[0]);
    }
}
