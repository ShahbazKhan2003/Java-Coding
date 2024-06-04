class Node{
    int data;
    Node left, right;
    public Node(int v){
        this.data = v;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    public static Node construct(int[] arr){
        if(arr.length ==0) return null;
        Node root = new Node(arr[0]);
        for(int i=1;i<arr.length;i++){
            insertAt(root , arr[i]);
        }
        return root;
    }
    public static void insertAt(Node rooot , int val){
        if(rooot==null) return;

        if(rooot.left == null) rooot.left = new Node(val);
        else if(rooot.right == null) rooot.right = new Node(val);
        else insertAt(rooot.left, val);
    }
    public static void preOrder(Node root){
        if (root==null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }
    public static void main(String[] args) {
        int[] arr = {3 , 2 , 4 , 1 , 5};
        Node rootNode = construct(arr);
        preOrder(rootNode);
        
    }
}
