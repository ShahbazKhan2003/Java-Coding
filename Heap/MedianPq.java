import java.util.PriorityQueue;
import java.util.Scanner;

public class MedianPq {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        //USe 2 PQ 1.left(max) smaller half store 2.right(min) greater half

        PriorityQueue<Integer> left = new PriorityQueue<>((a,b)->{     //Max heap
            return b-a;
        });

        PriorityQueue<Integer> right = new PriorityQueue<>();  //Min Heap

        left.add(arr[0]);
        int mid = arr[0];
        System.out.print(mid+" ");

        for(int i=1;i<n;i++){
           if(left.size() > right.size()){         //Agar left bda hai toh check kro jo arr[i] Small/Big
               if(arr[i] < left.peek()){
                  right.add(left.remove());
                  left.add(arr[i]);
               }
               else right.add(arr[i]);

               mid = (right.peek()+left.peek())/2;
           }
           else if(left.size() == right.size()){
                if(arr[i] < left.peek()){
                    left.add(arr[i]);
                    mid = left.peek();
                }
                else{
                    right.add(arr[i]);
                    mid = right.peek();
                }
                
           }
           else{
               if(arr[i] < left.peek()) left.add(arr[i]);

               else{
                  left.add(right.remove());
                  right.add(arr[i]);
               }
               mid = (right.peek()+left.peek())/2;
           }

             System.out.print(mid+" ");

        }
    }
}
