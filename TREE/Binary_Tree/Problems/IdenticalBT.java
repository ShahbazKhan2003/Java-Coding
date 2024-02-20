
public class IdenticalBT {

    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    public static boolean isIdentical(Node p,Node q){
        if(p==null && q== null) return true;
        if(p==null || q== null) return false;

        if(p.val != q.val) return false;

        return isIdentical(p.left, q.left) && isIdentical(p.right, q.right);
    }
    public static void main(String[] args) {
        Node p = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        p.left = a;
        p.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        b.right = e;
        //2nd
        Node q = new Node(1);
        Node a1 = new Node(2);
        Node b1 = new Node(3);
        q.left = a1;
        q.right = b1;
        Node c1 = new Node(4);
        Node d1 = new Node(5);
        a1.left = c1;
        a1.right = d1;
        Node e1 = new Node(6);
        Node e2 = new Node(10);
        b1.left =  e2;
        b1.right = e1;


        boolean ans =isIdentical(p, q);
        System.out.println( ans);
    }
}
