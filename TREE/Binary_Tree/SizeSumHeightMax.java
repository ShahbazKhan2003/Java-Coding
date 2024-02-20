public class SizeSumHeightMax {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    public static int SIZE(Node root){
        if(root == null) return 0;

        int leftsize = SIZE(root.left);
        int rightsize = SIZE(root.right);

        return leftsize+rightsize+1;
    }
    public static int Sum(Node root){
        if(root == null) return 0;

        int leftsub = Sum(root.left);
        int rightsub = Sum(root.right);

        return root.val+leftsub+rightsub;
    }
    public static int Maxi(Node root){
        if(root == null) return Integer.MIN_VALUE;

        int m1 = Maxi(root.left);
        int m2 = Maxi(root.right);

        int ans = Math.max(m1,m2);
        return Math.max(ans, root.val);
    }
    public static int Height(Node root){
        if(root == null) return -1;

        int leftsub = Height(root.left);
        int rightsub = Height(root.right);
        int maxheight = Math.max(leftsub,rightsub);

        return 1+maxheight;
    }
    public static int Minimum(Node root){
        if(root == null) return Integer.MAX_VALUE;

        int leftsub = Minimum(root.left);
        int rightsub = Minimum(root.right);
        int mini  = Math.min(leftsub, rightsub);

        return Math.min(mini, root.val);
    }
    public static int Product(Node root){
        if(root == null) return 1;

        int leftsub = Product(root.left);
        int rightsub = Product(root.right);

        int mul = leftsub*rightsub;

        return mul*root.val;
    }

    // public static void display(Node root){
    //     if(root==null) return;
    //     System.out.print(root.val+"-> ");
    //     if(root.left!=null) System.out.print(root.left.val+" ");
    //     else System.out.print("Null" +",");
    //     if(root.right!=null) System.out.print(root.right.val);
    //     else System.out.print("NUll" +",");
    //     System.out.println();
    //     display(root.left);
    //     display(root.right);
    // }
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
        // Node f = new Node(19);
        // b.left = f;
        // display(root);  

        int size = SIZE(root);
        System.out.println(size);

        int sum =Sum(root);
        System.out.println(sum);

        int max = Maxi(root);
        System.out.println(max);

        int min = Minimum(root);
        System.out.println(min);

        int height = Height(root);
        System.out.println(height);

        int mul = Product(root);
        System.out.println(mul);


    }
}
