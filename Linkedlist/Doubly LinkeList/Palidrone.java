class Node 
{
    int val;
    Node next;
    Node prev;
    Node(int data)
    {
        val = data;
    }
}
public class Palidrone {
    public static boolean checkpalindrone(Node head)
    {
        Node temp = head;
        Node t1 = head;
        while(t1.next != null)
        {
            t1 = t1.next;
        }
        while(temp!=null && t1 !=null &&temp.next!=t1.prev && temp!=t1)
        {
            if(temp.val == t1.val)
            {
                temp = temp.next;
                t1 = t1.prev;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(1);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        boolean check =checkpalindrone(a);
        System.out.println(check);

    }
}
