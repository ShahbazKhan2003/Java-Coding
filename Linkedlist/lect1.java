import java.util.*;

class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
    }
}

public class lect1 {
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;


        // System.out.println(a);
        // System.out.println(a.data);
        // System.out.println(a.next);
        // System.out.println(a.next.data);
        // System.out.println(b);
        // System.out.println(b.next);

        //Display of LL

        Node temp = a;
        // System.out.println(a);
        // System.out.println(temp);
        // System.out.println(a.data);
        // System.out.println(temp.data);
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();

        displayLL(a);
        System.out.println();
        ReversedisplayLL(a);
        System.out.println();
        lengthLL(a);
        System.out.println();
        
        
    }
    public static void displayLL(Node temp)
    {
        if(temp == null) return;
        System.out.print(temp.data+"->");
        displayLL(temp.next);
    }
    public static void ReversedisplayLL(Node temp)
    {
        if(temp == null) return;
        displayLL(temp.next);
        System.out.print(temp.data+"->");
    }
    public static void lengthLL(Node temp)
    {
        int count=1;
        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }
        System.out.print(count);
    }
    

}
