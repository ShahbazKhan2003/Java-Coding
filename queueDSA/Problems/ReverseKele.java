import java.util.*;
public class ReverseKele {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        int n = q.size();
        System.out.println(q);

        Stack<Integer> st = new Stack<>();
        while(st.size()<k)
        {
            st.push(q.remove());
        }
        
//Using 2 Queue
        // Queue<Integer> q1 = new LinkedList<>();
        // while(!st.isEmpty())
        // {
        //     q1.add(st.pop());
        // }
        // System.out.println(q1);
        // while(!q.isEmpty())
        // {
        //     q1.add(q.remove());
        // }
        // System.out.println(q1);

//Using Only Stack & given Queue
       while(!st.isEmpty())
       {
          q.add(st.pop());
       }
       for(int i =0;i<n-k;i++)
       {
           q.add(q.remove());
       }
       System.out.println(q);
    }
}
