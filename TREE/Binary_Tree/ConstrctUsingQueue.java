import java.util.*;
class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class ConstrctUsingQueue{
    public static Node buildtree(int[] arr){
        if( arr==null|| arr.length==0) return null;

        Node root = new Node(arr[0]);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i=1;
        while(i<arr.length){
            Node curr = q.remove();
            if(i<arr.length){
                curr.left  = new Node(arr[i++]);
                q.add(curr.left);
            }
            if(i<arr.length){
                curr.right = new Node(arr[i++]);
                q.add(curr.right);
            }
        }
        return root;

    }
    public static void preorde(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorde(root.left);
        preorde(root.right);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        Node root = buildtree(arr);
        preorde(root);
    }
}