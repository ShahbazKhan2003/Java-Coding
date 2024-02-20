import java.util.*;
// public class ReverseStack {
//     public static void main(String[] args) {
//         // Stack<Integer> st = new Stack<>();
//         // //Using an extra stack
//         // st.push(10);
//         // st.push(20);
//         // st.push(30);
//         // st.push(40);
//         // st.push(50);
//         // int n = st.size();
//         // System.out.println(st);
//         // Stack<Integer> s  = new Stack<>();
//         // for(int i=0;i<n;i++)
//         // {
//         //     int k = st.peek();
//         //     s.push(k);
//         //     st.pop();
//         // }
//         // System.out.println(s);

// //Taking Input
//         Scanner sc = new Scanner(System.in);
//         Stack<Integer> st = new Stack<>();
//         while(sc.hasNextInt())
//         {
//             st.push(sc.nextInt());
//         }
//         int n =  st.size();
       
//         // System.out.println(st);
//         // Stack<Integer> st1 = new Stack<>();
//         // for(int i=0;i<n;i++)
//         // {
//         //     int k = st.peek();
//         //     st1.push(k);
//         //     st.pop();
//         // }
//         // System.out.println(st1);
//         reversestack(st,n);
//     }
//     public static void reversestack(Stack st,int n)
//     {
//         if(st.isEmpty()) return;
 
//         System.out.print(st.peek()+" ");
//         st.pop();
//         reversestack(st, n);
//     }
    
// }

public class ReverseStack{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);

        reversestack(st);

        System.out.println(st);
    }
    public static void reversestack(Stack<Integer> st)
    {
        if(st.size()==1) return;

        int top = st.pop();

        reversestack(st);

        pushatbottom(st,top);
    }
    public static void pushatbottom(Stack<Integer> st,int top)
    {
        if(st.size()==0){
            st.push(top);
            return;
        } 
        int x = st.pop();
        pushatbottom(st, top);
        st.push(x);
    }
}