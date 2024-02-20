import java.util.*;

public class DFS_Traversal {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void dfs_inorder(Node root) {
        Stack<Node> st = new Stack<>();
        if (root == null)
            return;

        st.push(root);
        while (st.size() > 0) {
            Node temp = st.peek();
            if (temp.left != null) {
                st.push(temp.left);
                temp.left = null;
            } else {
                st.pop();
                System.out.print(temp.val + " ");
                if (temp.right != null) {
                    st.push(temp.right);
                    temp.right = null;
                }
            }
        }
    }

    public static void dfs_preorder(Node root) {
        Stack<Node> st = new Stack<>();
        if (root == null)
            return;
        st.push(root);

        while (st.size() > 0) {
            Node temp = st.peek();
            System.out.print(temp.val+ " ");
            st.pop();
            if (temp.right != null) {
                st.push(temp.right);
            }

            if (temp.left != null) {
                st.push(temp.left);
            }
        }

    }

    public static void dfs_postorder(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        if (root == null)
            return;

        st.push(root);

        while (st.size() > 0) {
            Node temp = st.peek();
            st2.push(st.pop());

            if(temp.left!=null) st.push(temp.left);

            if(temp.right!=null) st.push(temp.right);
        }

        while(!st2.isEmpty()){
            arr.add(st2.pop().val);
        }

        System.out.println(arr);

       
    }

    public static void main(String[] args) {
        // It uses Stack
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

        // dfs_inorder(root);
        System.out.println();
        // dfs_preorder(root);
        System.out.println();
        dfs_postorder(root);
    }
}
