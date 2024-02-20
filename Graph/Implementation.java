import java.util.ArrayList;
import java.util.List;

public class Implementation {
    public static void main(String[] args) {
        //Implementation can be of 2 types 
        // 1. Adjacency Matrix - 2D Array
        // 2. List             - List<List<>>

//Adjacency matrix
        int n = 3;   //no of nodes
        int m = 3;  // no of edges

        int[][] adj = new int[n+1][n+1];        //if 1 based indexing
        //undirected edge 1--2
        adj[1][2] = 1;
        adj[2][1] = 1;
        //edge 2--3
        adj[2][3] = 1;
        adj[3][2] = 1;
        //edge 4-3
        // adj[3][4] = 1;
        // adj[4][3] = 1;

//List
        List<List<Integer>> li = new ArrayList<>();
        for(int i=0;i<=n;i++) li.add(new ArrayList<>());          //1 based indexing

        //edge 1--2
        li.get(1).add(2);
        li.get(2).add(1);
        
        //edge 2--3
        li.get(2).add(3);
        li.get(3).add(2);

        // edge 1--3
        li.get(1).add(3);
        li.get(3).add(1);

        for(int i=1;i<li.size();i++){
            for(int j=0;j<li.get(i).size();j++){
                System.out.print(li.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
}
