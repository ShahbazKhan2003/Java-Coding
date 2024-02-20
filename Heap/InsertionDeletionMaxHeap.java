import java.util.*;
public class InsertionDeletionMaxHeap {
    public static void delmaxheap(List<Integer> heap){
        swap(heap,0,heap.size()-1);
        heap.remove(heap.size()-1);
        pushdown(heap,0);
    }
    public static void pushdown(List<Integer> heap, int idx){
        int n = heap.size();
        if(idx == n) return;
        int left = (2*idx)+1;
        int right = (2*idx)+2;
        int small = idx;
        
        if(left<=n && heap.get(left) > heap.get(small)){
            small = left;
        }
        if(right<=n && heap.get(right) > heap.get(small)){
            small = right;
        }
        if(idx == small) return;
        swap(heap, small, idx);
        pushdown(heap, small);
    }
    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(60);
        heap.add(50);
        heap.add(40);
        heap.add(30);
        heap.add(20);
        heap.add(30);
        heap.add(10);
        // System.out.println(heap);
        // insert(heap,500);
        System.out.println(heap);
        delmaxheap(heap);
        System.out.println(heap);
    }
    public static void insert(List<Integer> heap,int val){
        heap.add(val);
        int n = heap.size()-1;
        pushup(heap,n);
    }
    public static void pushup(List<Integer> heap,int i){
        int parent = (i-1)/2;
        if(i==0 || heap.get(parent) > heap.get(i)) return;

        swap(heap,i,parent);
        pushup(heap, parent);
    }
    public static void swap(List<Integer> heap,int l,int r){
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
    }

}
