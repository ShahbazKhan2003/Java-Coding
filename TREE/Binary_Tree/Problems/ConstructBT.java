import java.util.*;
public class ConstructBT {
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
        String arr[] = {"1", "2", "3", "4", "5", "6", "6", "6", "6", "6"};
        Node root = constructbfs(arr);
        int height = getheight(root);
        for(int i=1;i<=height;i++){
            nthlevel(root, i);
            System.out.println();
        }


    }
}
