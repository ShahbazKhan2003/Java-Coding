class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}
class Linkedlist{
    Node head = null;
    Node tail = null;
     
    void insertattail(int val)
    {
        Node temp = new Node(val);
        if(head == null)
        {
            head = temp;
            tail = temp;
        }
        else
        {
            tail.next= temp;
            tail = temp;
        }
    }

    void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void ReverseLL()
    {
        Node curr = head;
        Node prev = null;
        Node n = null;

        while(curr!=null)
        {
            n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }
        Node temp = prev;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();

    }

}
public class ReverseLL {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertattail(10);
        ll.insertattail(20);
        ll.insertattail(30);
        ll.insertattail(40);
        ll.insertattail(50);
        ll.display();
        ll.ReverseLL();

    }
}
