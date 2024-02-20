import java.util.*;

public class BFS {
     public static class Node{
        int value;
        List<Node> child;
        public Node(int value){
            this.value  = value;
            child = new ArrayList<>();
        }
    }

    public static void formTree(Node root){
        root.child.add(new Node(5));
        root.child.add(new Node(11));
        root.child.add(new Node(63));
        root.child.get(0).child.add(new Node(1));
        root.child.get(0).child.add(new Node(4));
        root.child.get(0).child.add(new Node(8));
        root.child.get(1).child.add(new Node(6));
        root.child.get(1).child.add(new Node(7));
        root.child.get(1).child.add(new Node(15));
        root.child.get(2).child.add(new Node( 31));
        root.child.get(2).child.add(new Node( 55));
        root.child.get(2).child.add(new Node( 65));
    } 
    public static void main(String[] args) {
        Node root = new Node(30);
        formTree(root);
        System.out.println();
        List<List<Integer>> ans = bfs(root);
        System.out.println(ans);
    }
    public static List<List<Integer>> bfs(Node root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int n = q.size();
            List<Integer> arr = new ArrayList<>();
            for(int i=0;i<n;i++){
                Node node = q.remove();
                arr.add(node.value);
                q.addAll(node.child);
            }
            ans.add(arr);
        }
        return ans;
    }
}
