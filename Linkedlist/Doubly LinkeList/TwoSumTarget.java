import java.lang.annotation.Target;

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
public class TwoSumTarget {
    public static void checksum(Node head,int Target)
    {
        Node temp = head;
        Node t1 = head;
        while(t1.next!=null)
        {
            t1 = t1.next;
        }
        while(temp.val < t1.val)
        {
            if(temp.val + t1.val == Target)
            {
               System.out.println(temp.val +" "+ t1.val);
               break;
              
            }
            else if (temp.val + t1.val < Target)
            {
                temp = temp.next;
            }
            else
            {
                t1 = t1.prev;
            }
        }
        if(temp.val>=t1.val)
        {
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        int target = 40;
        checksum(a, target);
        // int check = checksum(a,target);
        // System.out.println(check);
       
    }
}
