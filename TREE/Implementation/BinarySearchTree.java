class Node{
    int data;
    Node right , left;
    public Node(int val){
        this.data = val;
        this.right =null;
        this.left = null;
    }
}

public class BinarySearchTree {

    public static Node insert(Node root , int val){
        if(root == null) return new Node(val);

        if(root.data > val){
            root.left = insert(root.left, val);
        }
        else if(root.data < val){
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void printLevel(Node root , int lev){
        if(root == null) return;

        if(lev == 0){
            System.out.print(root.data + " ");
        }
        else{
            printLevel(root.left, lev-1);
            printLevel(root.right, lev-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3 , 2, 4 , 1 , 5};
        Node root = null;
        for(int i=0;i<arr.length;i++){
            root = insert(root , arr[i]);
        }
        int level = 2;
        printLevel(root , level);
    }
}
