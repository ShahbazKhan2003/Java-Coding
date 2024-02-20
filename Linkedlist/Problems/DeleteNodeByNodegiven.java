class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}
class linkedlist
{
    Node head = null;
    Node tail = null;

    void insertatEnd(int val)
    {
        Node temp = new Node(val);
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
    void deletenodebygivennode(int val)
    {
        Node curr = head;
        Node temp = head;
        Node prev = null;
        while(temp.next!=null)
        {
            if(curr.data != val)
            {
                prev = curr;
                curr = curr.next;
            }
            else{
            prev.next = prev.next.next;
            break;
            }
            temp = temp.next;
        }
    }
}

public class DeleteNodeByNodegiven {
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertatEnd(13);   
        ll.insertatEnd(1);   
        ll.insertatEnd(100);   
        ll.insertatEnd(50);   
        ll.insertatEnd(20); 
        ll.display();
        ll.deletenodebygivennode(20);
        ll.display();

           
    }
}
