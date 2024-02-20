import java.util.*;
import java.util.List;

public class CourseSchedule1 {
    public static void main(String[] args) {
        int[][] prerequisites = {{1,0},{2,1},{3,2}};
        int n = 4;
        int p = 3;

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        for(int i=0;i<p;i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
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
        int count = 0;
        while (!q.isEmpty()) {
            int val = q.remove();
            count++;
            for(var it:adj.get(val)){
                indeg[it]--;
                if(indeg[it]==0) q.add(it);
            }
        }
        if(count==n) System.out.println("True");
        else System.out.println("False");

    }
}
