import java.util.*;
public class Interleave1sthalfn2nd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        while(sc.hasNextInt())
        {
            int i = sc.nextInt();
            q.add(i);
        }
        int n = q.size();
        System.out.println(q);
//Using 2 queue
        // Queue<Integer> q1 = new LinkedList<>();
        // while(q.size()!=(n/2))
        // {
        //     q1.add(q.remove());
        // }
        // // System.out.println(q);
        // // System.out.println(q1);
        // Queue<Integer> helper = new LinkedList<>();
        // while(!q.isEmpty() && !q1.isEmpty())
        // {
        //     helper.add(q1.remove());
        //     helper.add(q.remove());
        // }
        // System.out.println(helper);

//Using Stack  
//Step1- Half of que to stack
//Step2- Empty st to que
//Step3- move half que to st
//Step4- 1 by 1 add st.peek & q.peek to q
//Step5- Reverse the que using st      

        Stack<Integer> st = new Stack<>();   
//1.
        while(q.size()!=(n/2)) 
        {
            st.push(q.remove());
        }
//2.
        while(!st.isEmpty())
        {
            q.add(st.pop());
        }
// 3.
        while(q.size()!=(n/2))
        {
            st.push(q.remove());
        }
//4.
        while(!st.isEmpty())
        {
            q.add(st.pop());
            q.add(q.remove());
        }
// 5.
        while(!q.isEmpty())
        {
            st.push(q.remove());
        }
        while(!st.isEmpty())
        {
            q.add(st.pop());
        }
        System.out.println(q);
      
    }
}
