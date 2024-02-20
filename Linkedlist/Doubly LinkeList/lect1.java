class Node
{
    int val;
    Node next;
    Node prev;
    public Node(int data)
    {
        this.val = data;
    }
}
class DLL
{
    Node head = null;
    Node tail = null;
    void insertathead(int val)
    {
        Node temp = new Node(val);
        if(head == null)
        {
            head = temp;
            tail = temp;
        }
        else
        {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }
    void insertatEnd(int val)
    {
        Node temp = new Node(val);
        if(head == null)
        {
            insertathead(val);
            return;
        }
        else
        {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    void insertAtAny(int val,int idx)
    {
        Node temp = new Node(val);
        Node t = head;

        if(idx == 0)
        {
            insertathead(val);
            return;
        }
        else if ( idx == size() +1)
        {
            insertatEnd(val);
            return;
        }
        else
        {
            for(int i =1;i<idx-1;i++)
            {
                t = t.next;
            }
            temp.next = t.next;
            t.next.prev = temp;
            t.next = temp;
            temp.prev = t;
        }
    }
    void displayUsingNext()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void displayUsingPrev()
    {
        Node temp = tail;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    int size()
    {
        Node temp = head;
        int count =0;
        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }
        return count;
        
    }
}
public class lect1 {
    public static void main(String[] args) {
        // Node a = new Node(4);
        // Node b = new Node(10);
        // Node c = new Node(2);
        // Node d = new Node(99);
        // Node e = new Node(13);
        // a.next = b;
        // b.prev = a;
        // b.next = c;
        // c.prev = b;
        // c.next = d;
        // d.prev = c;
        // d.next = e;
        // e.prev = d;
        // display(a);
        // displayR(e);
        // display2(c);
        DLL ll = new DLL();
        // ll.insertathead(4);
        // ll.insertathead(10);
        // ll.insertathead(5);
        // ll.insertathead(3);
        // ll.insertathead(100);
        // ll.displayUsingNext();
        ll.insertatEnd(4);
        ll.insertatEnd(10);
        ll.insertatEnd(5);
        ll.insertatEnd(3);
        ll.insertatEnd(18);
        ll.displayUsingNext();
        ll.displayUsingPrev();
        int size = ll.size();
        System.out.println(size);
        ll.insertAtAny(100, 3);
        ll.displayUsingNext();
    }
    public static void display(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp  = temp.next;
        }
        System.out.println();
    }
    public static void displayR(Node tail)
    {
        Node temp = tail;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp  = temp.prev;
        }
        System.out.println();
    }
    public static void display2(Node Random)
    {
        Node temp = Random;
        while(temp.prev!=null)
        {
            temp  = temp.prev;
        }
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
