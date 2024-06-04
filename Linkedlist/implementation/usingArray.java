class Node{
    int data;
    Node next;
    public Node(int d){
        this.data = d;
        this.next = null;
    }
}

public class usingArray {
    public static Node insert(Node root , int val){
        Node temp = new Node(val);
        Node ptr;

        if(root==null) root = temp;

        else{
            ptr = root;
            while(ptr.next!=null){
                ptr = ptr.next;
            }
            ptr.next = temp;
        }
        return root;

    }
    public static Node arrytoList(int[] arr){
        Node root = null;
        for(int i=0;i<arr.length;i++){
            root = insert(root , arr[i]);
        }
        return root;
    }
    public static void display(Node root){
        Node temp = root;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        Node root = arrytoList(arr);
        display(root);
    }
    
}
