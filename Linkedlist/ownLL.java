import javax.lang.model.util.ElementScanner6;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class linkedlist {
    Node head = null;
    Node tail = null;

    void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;
    }

    void insertAtBeg(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
            // insertAtEnd(val);
        } else {
            temp.next = head;
            head = temp;
        }
    }

    void insertAtAny(int index, int value) {
        Node t = new Node(value);
        Node temp = head;
        if (index == 0) {
            insertAtBeg(value);
            return;
        } else if (tail.next == null) {
            insertAtEnd(value);
            return;
        } else {
            for (int i = 1; i <= index - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    void size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println(count);
    }

    void getAt(int idx) {
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        System.out.println(temp.data);

    }

    void DeleteLL(int index) {
        if (index == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; i <= index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        // tail = temp;
    }
}

public class ownLL {
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtBeg(23);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.display();
        ll.size();
        ll.insertAtBeg(100);
        ll.display();
        ll.insertAtAny(4, 12);
        ll.display();
        System.out.println(ll.tail.data);

        ll.DeleteLL(2);
        ll.display();
        // ll.size();

    }
}
