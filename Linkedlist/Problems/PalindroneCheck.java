class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}
class Linkedlist
{
    Node head = null;
    Node tail = null;
    void insertattail(int data)
    {
        Node temp = new Node(data);
        if(head == null)
        {
            head = temp;
            tail = temp;
        }
        else
        {
            tail.next = temp;
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
    boolean PalindroneCheck()
    {
        //Creation of Duplicate LL
        Node newlist = null;
        Node temp = null;
        Node curr = head;
        while(curr!=null)
        {
            Node temp1 = new Node(curr.data);
            if(newlist == null)
            {
                newlist = temp1;
                temp = temp1;
            }
            else
            {
                temp.next = temp1;
                temp =temp1;
            }
            curr = curr.next;
        }
        //Reverse of LL
        Node curr1 = head;
        Node prev = null;
        Node n = null;
        while(curr1!=null)
        {
            n = curr1.next;
            curr1.next = prev;
            prev = curr1;
            curr1 = n;
        }
        //compare
        Node tempo = newlist;

        while(tempo!=null && prev!=null)
        {
            if(tempo.data == prev.data)
            {
                tempo = tempo.next;
                prev = prev.next;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
public class PalindroneCheck {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertattail(1);
        ll.insertattail(2);
        ll.insertattail(2);
        ll.insertattail(3);
        ll.display();
        boolean ans = ll.PalindroneCheck();

        if(ans)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
