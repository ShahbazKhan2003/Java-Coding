import java.util.*;
public class FirstNegativenum {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int windowsize = 3;
        int n = arr.length;

        int[] res = new int[n-windowsize+1];
//Brute Force
        // for(int i =0;(i+windowsize-1)<n;i++)
        // {
        //     int j;
        //     for(j=i;j<i+windowsize;j++)
        //     {
        //         if(arr[j]<0)
        //         {
        //             res[i] = arr[j];
        //             break;
        //         }
        //     }
        //     if(j==windowsize) res[i]=0;
        // }
        // System.out.print(Arrays.toString(res));

//Optimised
        
        Queue<Integer> q = new LinkedList<>();
        
        int i =0;
        int j =0;
        
        while(j<n)
        {
            if(arr[j]<0) q.add(arr[j]);
            
            if(j-i+1 < windowsize) j++;
            
            else if(j-i+1 == windowsize)
            {
                if(q.size() == 0) res[i] = 0;
                
                else
                {
                    res[i] = q.peek();
                    
                    if(arr[i] == q.peek())
                    {
                        q.remove();
                    }
                }
                i++;
                j++;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
