import java.util.Stack;
import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class Histogram {
    public static void main(String[] args) {
        int[] arr = {1 ,0 ,1 ,2 ,2 ,2 ,2 ,1 ,0 ,2};
        int n = arr.length;
        int[] nse = new int[n];
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();
        //nse solve
        st.push(n-1);
        nse[n-1] = n;

        for(int i = n-2;i>=0;i--)
        {
            while(!st.isEmpty() && arr[i] <= arr[st.peek()])
            {
                st.pop();
            }
            if(st.isEmpty()) nse[i] =n;
            else nse[i] = st.peek();

            st.push(i);
        }
        //empty the stack
        while(!st.isEmpty())
        {
            st.pop();
        }
        //pse cal
        pse[0] = -1;
        st.push(0);

        for(int i =1;i<n;i++)
        {
            while(!st.isEmpty() && arr[i] <= arr[st.peek()])
            {
                st.pop();
            }
            if(st.isEmpty()) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }

        int max = -1;
        for(int i =0;i<n;i++)
        {
            int ans = arr[i]*(nse[i] - pse[i] -1);
            max = Math.max(max, ans);
        }

        System.out.println(max);

        


    }
}
