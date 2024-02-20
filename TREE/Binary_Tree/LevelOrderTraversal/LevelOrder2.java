
public class LevelOrder2 {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
     public static int getheight(Node root){
        if(root==null) return 0;
        int l = getheight(root.left);
        int r = getheight(root.right);
        return 1+ Math.max(l,r);
    }
    public static void levelorder(Node root,int i){
        if(root==null) return;
        if(i==1){
            System.out.print(root.val+" ");
        }
        levelorder(root.left,i-1);
        levelorder(root.right,i-1);
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


        int height = getheight(root);
        for(int i=height;i>=1;i--){
            levelorder(root,i);
            System.out.println();
        }
      

    }
}
