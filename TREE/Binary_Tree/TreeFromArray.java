public class TreeFromArray {
    static class Node {
        int data;
        Node left, right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    Node root;
    public Node insertLevelOrder(int[] arr, int i)
    {
          Node temp = null;
        if (i < arr.length) {
            if (arr[i] == -1) {
                return null; 
            }
            temp = new Node(arr[i]);
 
            temp.left = insertLevelOrder(arr, 2 * i + 1);
 
            temp.right = insertLevelOrder(arr, 2 * i + 2);
        }
        return temp;
    }
    public void inOrder(Node root)
    {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    public static void main(String[] args) {
        TreeFromArray t2 = new TreeFromArray();
        int arr[] = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };
        t2.root = t2.insertLevelOrder(arr, 0);
        t2.inOrder(t2.root);
    }
}
