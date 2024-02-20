import java.util.*;

public class Traversal {

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
        preorder(root);
        System.out.println();
        postorder(root);
    }
    public static void preorder(Node root){
        if(root.child.isEmpty()){
            System.out.print(root.value+" ");
            return;
        }
        System.out.print(root.value+" ");
        int n  = root.child.size();
        for(int i=0;i<n;i++){
            preorder(root.child.get(i));
        }
    }
    public static void postorder(Node root){
        if(root.child.isEmpty()){
            System.out.print(root.value+" ");
            return;
        }
        int n  = root.child.size();
        for(int i=0;i<n;i++){
            postorder(root.child.get(i));
        }
        System.out.print(root.value+" ");
    }
}
