 // package LevelOrderTraversal;
public class PrintNthLevel {
    public static class Node{
        int val;
        Node left;
        Node right;

        public  Node(int val){
            this.val = val;
        }
    }
    public static int getheight(Node root){
        if(root == null) return 0;

        int left = getheight(root.left);
        int right = getheight(root.right);
        int ans = Math.max(left,right);

        return 1+ans;

    }

    public static void nthlevel(Node root, int n){
        if(root == null) return;
        if(n == 1){ 
            System.out.print(root.val+ " ");
            return; 
        }
        nthlevel(root.left, n-1);
        nthlevel(root.right, n-1);
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

        // nthlevel(root, 1);
        // nthlevel(root, 2);
        // nthlevel(root, 3);

        int level = getheight(root);
        for(int i=1;i<=level;i++){
             nthlevel(root, i);
        }
    }
}
