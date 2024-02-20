import java.util.LinkedList;
import java.util.*;
public class Deletion {
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
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
   
    
    public static void main(String[] args) {
        String arr[] = {"50", "20", "60", "17", "34", "55", "89","10","","28","","","","70","","","14"};
        Node root = constructbfs(arr);
        int height = getheight(root);
        inorder(root);
        System.out.println();
        // deleteWithNoChild(root,28);
        // inorder(root);
        // deleteWithOneChild(root, 10);
        // inorder(root);
        deleteAny(root,20);
        inorder(root);
    }
    public static void deleteWithNoChild(Node root,int tar){
       if(root==null) return;
       if(root.val > tar){
        if(root.left.val == tar) root.left=null;

        else deleteWithNoChild(root.left,tar);
       }
       else{
        if(root.right.val == tar) root.right=null;
        
        else deleteWithNoChild(root.right,tar);
       }
    }
    public static void deleteWithOneChild(Node root,int tar){
       if(root==null) return;

       if(root.val > tar){
        // if(root.left==null) return;
    
        if(root.left.val == tar) {
            Node l = root.left;
            if(l.left==null && l.right==null) root.left=null;

            else if(l.left==null || l.right==null){
                if(l.left!=null) root.left = l.left;
                else root.left = l.right;
            }
        }

        else deleteWithOneChild(root.left,tar);

       }

       else{
    //    if(root.right==null) return;
        if(root.right.val == tar) {
            Node r = root.right;
            if(r.left==null && r.right==null) root.right=null;

            else if(r.left==null || r.right==null){
                if(r.left!=null) root.right=r.left;

                else root.right = r.right;
            }
        }
        
        else deleteWithOneChild(root.right,tar);
       }
    }
    public static Node deleteAny(Node root,int tar){
        if(root==null) return null;
        if(tar > root.val){
            root.right = deleteAny(root.right, tar);
        }
        else if(tar < root.val) {
            root.left = deleteAny(root.left, tar);
        }
        else{
            if(root.left!=null && root.right!=null){
                int leftmax = max(root.left);
                root.val = leftmax;
                root.left = deleteAny(root.left, leftmax);
                return root;
            }
            else if(root.left!=null){
                return root.left;
            }
            else if(root.right!=null){
                return root.right;
            }
            else{
                return null;
            }
        }
        return root;
    }
    public static int max(Node root){
        if(root.right!=null) return max(root.right);

        else return root.val;
    }

}
