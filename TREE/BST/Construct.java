import java.util.LinkedList;
import java.util.*;
public class Construct{
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
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

    public static Node constructbfs(String[] arr){
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i =1;
        while(i<n-1){
            Node temp = q.remove();
            Node lft = new Node(-1);
            Node rgt = new Node(-1);   //kisi se bhi intialize krlo
            if(arr[i].equals("")){
                lft = null;
            }
            else{
                int l = Integer.parseInt(arr[i]);
                lft.val = l;
                q.add(lft);
            }
            if(arr[i+1].equals("")){
                rgt = null;
            }
            else{
                int r = Integer.parseInt(arr[i+1]);
                rgt.val = r;
                q.add(rgt);
            }
            temp.left = lft;
            temp.right = rgt;
            i+=2;
        }
        return root;
    }
   
    
    public static void main(String[] args) {
        String arr[] = {"10", "5", "15", "2", "8", "12", "17"};
        Node root = constructbfs(arr);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);


    }
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }

}