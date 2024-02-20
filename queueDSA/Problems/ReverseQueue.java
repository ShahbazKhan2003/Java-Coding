import java.util.*;
public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        int n = q.size();
        System.out.println(q);
//Using Stack        
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<n;i++)
        {
            st.push(q.remove());
        }
        int m = st.size();
        for(int i =0;i<m;i++)
        {
            q.add(st.pop());
        }
        System.out.println(q);

    }
}
