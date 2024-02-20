import javax.lang.model.util.ElementScanner6;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}
class reviselinkedlist
{
    Node head = null;
    Node tail = null;

    void insertAtEnd(int val)
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
    void insertAtBeg(int val)
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
            head = temp;
        }
    }
    void insertAtAny(int idx, int val)
    {
        Node temp = new Node(val);
        Node t = head;
        if(idx == 0)
        {
            insertAtBeg(val);
            return;
        }
        else if(tail.next == null)
        {
            insertAtEnd(val);
            return;
        }
        else
        {
            for(int i=1;i<=idx-1;i++)
            {
                t = t.next;
            }
            temp.next = t.next;
            t.next = temp;
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
    int size()
    {
        Node temp = head;
        int count = 0;
        while(temp.next != null)
        {
            count++;
            temp = temp.next;
        }
        //System.out.println(count);
        return count;
    }
    void getValAt(int idx)
    {
        Node temp = head;

        for(int i=1;i<=idx;i++)
        {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    void DeleteAtBeg()
    {
            head = head.next;
        
    }
    void DeleteAtEnd()
    {
        if(head == null || head.next == null){
            head = null;
        }
        Node temp = head;
        while(temp.next.next!=null)
        {
          temp = temp.next;
        }
        temp.next = null;
        tail = temp;
          
    }
    void DeleteAtAny(int idx)
    {
        int s = size();
        if(idx == 0)
        {
            DeleteAtBeg();
            return;
        }
        else if (idx == s)
        {
            DeleteAtEnd();
            return;
        }
        else
        {
          Node temp = head;
          for(int i = 1;i<=idx-1 ;i++)
          {
            temp = temp.next;
          }
          temp.next = temp.next.next;
          
        }
    }

}

public class rough {
    public static void main(String[] args) {
        reviselinkedlist ll = new reviselinkedlist();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.display();
        ll.DeleteAtAny(3);
        // System.out.println(ll.size());
        // ll.display();
        // ll.DeleteAtEnd();
        System.out.println(ll.tail.data);
        //   ll.size();
        //   ll.getValAt(2);
        // ll.display();
        // System.out.println(ll.tail.data);

        

    }
}
