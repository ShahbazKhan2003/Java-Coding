import java.util.*;
public class rough {
    public static class Node{
        int val;
        Node left;
        Node right;
        
        public Node(int val){
            this.val = val;
        }
    }

    public static int Size(Node root){
        if(root==null) return 0;
        
        int left = Size(root.left);
        int right = Size(root.right);
        return 1+left+right;
    }
    
    public static int Maxi(Node root){
        if(root == null) return Integer.MIN_VALUE;

        int a = Maxi(root.left);
        int b = Maxi(root.right);
        int ans = Math.max(a,b);

        return Math.max(ans,root.val);
    }
    public static int Height(Node root){
        if(root == null) return 0;

        int l = Height(root.left);
        int r = Height(root.right);
        int m = Math.max(l, r);
        return 1+m;
    }
    public static int Sum(Node root){
        if(root == null) return 0;

        int a = Sum(root.left);
        int b = Sum(root.right);
        int s = a+b;
        return s+root.val;
    }

    public static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);

        while(q.size()>0){
            Node temp = q.peek();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);

            System.out.print(temp.val+" ");
            q.remove();
        }

    }

    public static void dfs_inorder(Node root){
        Stack<Node> st = new Stack<>();
        if(root==null) return; 
        
        st.push(root);

        while(st.size()>0){
            Node temp = st.peek();
            if(temp.left!=null) {
                st.push(temp.left);
                temp.left=null;
            }
            else{
                st.pop();
                System.out.print(temp.val+" ");
                if(temp.right!=null) {
                    st.push(temp.right);
                    temp.right=null;
                }
            }
        }
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
   
        int size = Size(root);
        System.out.println(size);
        int max = Maxi(root);
        System.out.println(max);
        int h = Height(root);
        System.out.println(h);
        int sum = Sum(root);
        System.out.println(sum);

        bfs(root);
        System.out.println();
        dfs_inorder(root);

    }
}
