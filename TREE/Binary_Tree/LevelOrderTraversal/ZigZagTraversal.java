public class ZigZagTraversal {
    public static class Node {
        Node left;
        Node right;
        int val;

        public Node(int val) {
            this.val = val;
        }
    }

    public static int getheight(Node root) {
        if (root == null) return 0;
        
        int left = getheight(root.left);
        int right = getheight(root.right);
        int max = Math.max(left, right);

        return 1 + max;
    }

    public static void nthlevel1(Node root, int n) {
        if (root == null)
            return;

        if (n == 1) {
            System.out.print(root.val + " ");
            return;
        }
        nthlevel1(root.left, n - 1);
        nthlevel1(root.right, n - 1);

    }

    public static void nthlevel2(Node root, int n) {
        if (root == null)
            return;

        if (n == 1) {
            System.out.print(root.val + " ");
            return;
        }
        nthlevel2(root.right, n - 1);
        nthlevel2(root.left, n - 1);
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

        for (int i = 1; i <= height; i++) {
            if(i%2!=0) nthlevel1(root, i);

            else nthlevel2(root, i);
            
            System.out.println();
        }
    }
}
