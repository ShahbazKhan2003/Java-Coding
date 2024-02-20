
public class BalancedBinaryTree {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static boolean isBalanced(Node root){

        if(root==null ) return true;
        int lh = isCheck(root.left);
        if(root.left!=null) lh++;
        int rh = isCheck(root.right);
        if(root.right!=null) rh++;
        int ans = Math.abs(lh - rh);
        if(ans>1) return false;

        return (isBalanced(root.left) && isBalanced(root.right));

    }
    public static int isCheck(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        int lft = isCheck(root.left);
        int rgt = isCheck(root.right);

        return 1+Math.max(lft, rgt);
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

        boolean ans = isBalanced(root);
        System.out.println(ans);
        
    }    
}
