import java.util.*;
public class BoundaryLevelT{
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        ArrayList<Integer> arr = new ArrayList<>();
        
        
        borderlevelD(root,arr);
        System.out.println(arr);
    }

    public static void borderlevelD(Node root,ArrayList<Integer> arr){
        leftdisplay(root,arr);
        leafnode(root,arr);
        rightdisplay(root.right,arr);
    }
    public static void leftdisplay(Node root,ArrayList<Integer> arr){
        if(root==null) return;
        if(root.left==null && root.right==null) return;

        // System.out.print(root.val+" ");
        arr.add(root.val);
        if(root.left!=null) leftdisplay(root.left,arr);
        
        else leftdisplay(root.right,arr);
        
    }
    public static void leafnode(Node root,ArrayList<Integer> arr){
        if(root==null) return;

        if(root.left==null && root.right==null){
            // System.out.print(root.val+" ");
            arr.add(root.val);
            return;
        }
        leafnode(root.left,arr);
        leafnode(root.right,arr);
    }
    public static void rightdisplay(Node root,ArrayList<Integer> arr){
        if(root==null) return;
        if(root.left==null && root.right==null) return;

        if(root.right!=null) rightdisplay(root.right,arr);

        else rightdisplay(root.left,arr);
        
        // System.out.print(root.val+" ");
        arr.add(root.val);
    }
    
}