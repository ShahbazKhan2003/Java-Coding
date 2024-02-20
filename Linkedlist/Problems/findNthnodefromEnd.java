public class findNthnodefromEnd {
public static  class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}
//1st Method
    // public static Node nthnode(Node headNode,int n)
    // {
    //     int size = 0;
    //     Node store = headNode;
    //     while(store!=null)
    //     {
    //         size++;
    //         store = store.next;
    //     }
    //     int m = size-n+1;
    //     store = headNode;
    //     for(int i=1;i<=m-1;i++)
    //     {
    //         store = store.next;
    //     }
    //     return store;
    // }
//2nd Method
      public static Node nthnode(Node heaNode,int n)
      {
        Node slow = heaNode;
        Node fast = heaNode;
        for(int i=1;i<=n;i++)
        {
            fast = fast.next;
        }
        while(fast!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
      }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node temp = nthnode(a,3);
        System.out.println(temp.data);
    }   
}
