import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2};
        int[] res = new int[arr.length];

//Using Array
        // for(int i =0;i<arr.length;i++)
        // {
            // res[i] = -1;
        //     int j;
        //     for(j =i+1;j<arr.length;j++)
        //     {
        //         if(arr[i]<arr[j])
        //         {
        //             res[i] = arr[j];
        //             break;
        //         }
        //     }
        //   // if(j>=arr.length)
        //    // {
        //    //     res[i] = -1;
        //    // }
        // }
        // for(int i :res)
        // {
        //     System.out.print(i+" ");
        // }

//Using Stack
        // Stack<Integer> st = new Stack<>();
        // int n = arr.length;
        // res[n-1] = -1;
        // st.push(arr[n-1]);
// 1st Method 
        // for(int i = n-2;i>=0;i--)
        // {
        //     //res[i] =-1;
        //     if(arr[i] < st.peek())
        //     {
        //         res[i] = st.peek();
        //         st.push(arr[i]);
        //     }
        //     else
        //     {
        //        while(arr[i]>st.peek())
        //        {
        //          st.pop();
        //          if(st.isEmpty())
        //          {
        //             res[i] = -1;
        //             st.push(arr[i]);
        //          }
        //        }
        //        if(arr[i] < st.peek())
        //        {
        //         res[i] = st.peek();
        //         st.push(arr[i]);
        //        }
        //     }
        // }
        //  for(int i :res)
        // {
        //     System.out.print(i+" ");
        // }

//2nd Meth
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        res[n-1] = -1;
        st.push(arr[n-1]);

        for(int i = n-2;i>=0;i--)
        {
            
            while(arr[i] > st.peek() && st.size()!=0)
            {
                st.pop();
            }
            if(st.size()==0) res[i] = -1;
            else res[i] = st.peek();
            
            st.push(arr[i]);
        }

        for(int i :res)
        {
            System.out.print(i+" ");
        }

        
    }
}
