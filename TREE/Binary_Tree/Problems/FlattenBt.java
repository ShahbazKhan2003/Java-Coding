import java.util.*;

public class FlattenBt {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(5);
        root.left = a;
        root.right = b;
        Node c = new Node(3);
        Node d = new Node(4);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        b.right = e;

        Node p = new Node(root.val);
        helper(root.left,p);
        ppre(p);
    }
    public static void helper(Node root,Node p){
        if(root==null) return;
        // p.left=null;
        p.right=root;
        helper(root.left, p.right);
        helper(root.right,p.right);
    }
    public static void ppre(Node p){
        if(p==null) return;
        System.out.print(p.val+"->");
        ppre(p.left);
        ppre(p.right);

    }
}
