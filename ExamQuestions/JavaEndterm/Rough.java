class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class Rough {
    public static Node constructBST(Node root , int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = constructBST(root.left, val);
        }
        else root.right = constructBST(root.right, val);
        return root;
    }
    public static void main(String[] args) {
        int[] arr = {6 ,2 ,8, 0 ,4 ,7 ,9 ,3 ,5};
        int p  = 2;
        int q = 8;

        Node root = null;
        for(int i=0;i<arr.length;i++){
            root = constructBST(root,arr[i]);
        }
        inorder(root);
        
    }
    public static void inorder(Node root){
        if(root==null)  return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
}
