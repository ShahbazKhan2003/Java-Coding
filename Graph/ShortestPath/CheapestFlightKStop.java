import java.util.*;
class Pair{
    int first,second;
    public Pair(int f , int s){
        first = f;
        second = s;
    }
}
class Trio{
    int first,second,third;
    public Trio(int f, int s , int t){
        first = f;
        second = s;
        third = t;
    }
}
public class CheapestFlightKStop {
    public static void main(String[] args) {
        int n = 4; 
        int[][] flights = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}}; 
        int src = 0;
        int  dst = 3; 
        int k = 1;

        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Pair> te = new ArrayList<>();
            adj.add(te);
        }

        for(int i=0;i<flights.length;i++){
            adj.get(flights[i][0]) .add(new Pair(flights[i][1], flights[1][2]));
        }

        int[] dis = new int[n];
        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[src]  = 0;
        Queue<Trio> q = new LinkedList<>();
        q.add(new Trio(0, src, 0));

        while (!q.isEmpty()) {
            Trio tt = q.remove();
            int stop = tt.first;
            int node = tt.second;
            int cost = tt.third;
            if(stop>k) continue;
            for(var it : adj.get(node)){
                int adjnode = it.first;
                int adjwgt = it.second;

                if(cost + adjwgt < dis[adjnode] && stop <= k){
                    dis[adjnode] = cost + adjwgt;
                    q.add(new Trio(stop+1, adjnode, dis[adjnode]));
                }
            }
        }
        System.out.println(Arrays.toString(dis));
        System.out.println(dis[dst]);

    }
}
