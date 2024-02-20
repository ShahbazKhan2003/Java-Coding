public class WidthBT {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
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
        b.right = e;
        int[] arr = new int[2];   //1 for min value and 2 for max value of BT
        arr[0]= Integer.MAX_VALUE;
        arr[1]= Integer.MIN_VALUE;
        width(root,arr,0);
        
        System.out.println(arr[1]-arr[0]+1);

    }
    public static void width(Node root,int[] arr,int h1){
        if(root==null) return;
        
        arr[0]= Math.min(arr[0],h1);
        arr[1]= Math.max(arr[1],h1);
        width(root.left, arr, h1-1);
        width(root.right, arr, h1+1);
    }
}
