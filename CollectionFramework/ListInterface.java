import java.util.*;
public class ListInterface {

    public static void StackExample(){
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s);
        s.pop();
        s.push(100);
        System.out.println(s);
        System.out.println(s.peek());

        System.out.println(s.isEmpty());

        System.out.println(s.size());

        System.out.println(s.search(1000));   //It searches distance from top of stack 

        System.out.println(s.contains(100));
    }

    public static void main(String[] args) {

        // ArraylistExample();
        // LinkedlistExample();
        StackExample();
    }

    public static void ArraylistExample(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        System.out.println(l.get(0));
        l.set(1, 20);
        l.add(3, 10);
        l.add(4, 100);
        l.add(5, 100);
        System.out.println(l);
        System.out.println("First Index of that element "+l.indexOf(100));
        System.out.println("Last Index of that element "+l.lastIndexOf(100));
        System.out.println(l.contains(10));
    }

    public static void LinkedlistExample(){
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.addLast(2);
        l.addFirst(3);
        System.out.println();
        System.out.println(l);
        System.out.println(l.get(0));
        System.out.println(l.getFirst());
        System.out.println(l.getLast());

        l.set(1, 20);
        l.add(3, 10);
        l.add(4, 100);
        l.add(5, 100);
        System.out.println(l);
        System.out.println("First Index of that element "+l.indexOf(100));
        System.out.println("Last Index of that element "+l.lastIndexOf(100));
        System.out.println(l.contains(10));
    }
}
