import java.security.PublicKey;

public class Traversals {
    // static int size =0;
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    public static void PREORDER(Node root){
        if(root==null) return;

        System.out.print(root.val+" ");
        PREORDER(root.left);
        PREORDER(root.right);
    }
    public static void POSTORDER(Node root){
         if(root==null) return;

        POSTORDER(root.left);
        POSTORDER(root.right);
        System.out.print(root.val+" ");

    }
    
    public static void INORDER(Node root){
        if(root==null) return;

        INORDER(root.left);
        System.out.print(root.val+" ");
        INORDER(root.right);

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
        b.right = e;

        PREORDER(root);              //Root Left Right
        System.out.println();
        INORDER(root);              // Left Root Right
        System.out.println();
        POSTORDER(root);

    }
}
