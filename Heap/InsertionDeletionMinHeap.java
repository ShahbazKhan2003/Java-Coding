import java.util.*;

public class InsertionDeletionMinHeap {
    public static void delminheap(List<Integer> heap){
        //Swap 1st and last
        swap(heap,0,heap.size()-1);
        //Remove last
        heap.remove(heap.size()-1);
        //Correct Heap
        pushdown(heap,0,heap.size()-1);
    }
    public static void pushdown(List<Integer> heap, int idx,int n){
        if(idx==n) return;
        int lft = (2*idx)+1;
        int rgt = (2*idx)+2;
        int small = idx;
        if(lft<=n && heap.get(lft) < heap.get(small)){
            small = lft;
        }
        if(rgt<=n && heap.get(rgt) < heap.get(small)){
            small = rgt;
        }
        if(small==idx) return;
        swap(heap, idx, small);
        pushdown(heap, small, n);
       
    }
    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(5);                                             //Left child = (2*i)+1;
        heap.add(20);                                             //Right Child = (2*i)+2;
        heap.add(10);                                             //Parent  =  (i-1)/2;
        heap.add(40);
        heap.add(50);
        heap.add(30);
        heap.add(60);
        // System.out.println(heap);
        //Insertion
        //minheap(heap, 5);
        System.out.println(heap);
        //Deletion
        delminheap(heap);
        System.out.println(heap);
    }
    public static void minheap(List<Integer> heap,int ele){
        //Last mei add krdo phele
        heap.add(ele);
        int idx = heap.size()-1;
        pushup(heap,idx);
    }
    public static void pushup(List<Integer> heap,int idx){
        //Compare with Parent / Swap
        //Until root reaches/ correct postiton found
        int parentIndex = (idx-1)/2;
        
        if(idx==0 || heap.get(parentIndex) < heap.get(idx)) return;
        
        swap(heap,idx,parentIndex);

        pushup(heap,parentIndex);

    }
    public static void swap(List<Integer> heap,int l,int r){
        int temp = heap.get(l);
        heap.set(l,heap.get(r) );
        heap.set(r,temp);
    }
}
