import javax.naming.ldap.LdapName;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}
class Linekedlist
{
    Node head =null;
    Node tail =null;
    void insertattail(int val)
    {
        Node temp = new Node(val);
        Node t = head;
        if(head == null)
        {
            head = temp;
            tail = temp;
        }
        else
        {
            tail.next =temp;
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
    Node oddevenll()
    {
        Node temp = head;
        Node temp1 = head;
        Node odd = new Node(100);
        Node t = odd;
        
        while(temp!=null)
        {
            if(temp.data %2 == 0)
            {
                t.next = temp;
                t = temp;
            }
            temp = temp.next;
        }
        while(temp1!=null)
        {
            if(temp1.data%2!=0)
            {
                t.next =temp1;
                t = temp1;
            }
            temp1 = temp1.next;
        }
        t.next = null;
     return odd;
    }
    void printll(Node odd)
    {
        Node temp = odd.next;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class oddnevenLL {
    public static void main(String[] args) {
        Linekedlist ll =  new Linekedlist();
        ll.insertattail(1);
        ll.insertattail(2);
        ll.insertattail(3);
        ll.insertattail(4);
        ll.insertattail(5);
        ll.display();
        Node store = ll.oddevenll();
        System.out.println("------");
        
       ll.printll(store);
        
    }
}
