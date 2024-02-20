import java.util.ArrayList;
import java.util.List;

public class MaxHeapify {
    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(5);
        heap.add(15);
        System.out.println(heap);
        buildheap(heap);
        System.out.println(heap);
    }
    public static void buildheap(List<Integer> heap){
        int firstnonleafNode = ((heap.size()-1)-1)/2;
        for(int i=firstnonleafNode;i>=0;i--){
            pushdown(heap, i,heap.size()-1);
        }
    }
    public static void pushdown(List<Integer> heap, int idx,int n){
        // int n = heap.size()-1;
        if(idx==n) return;
        int left = (2*idx)+1;
        int right = (2*idx)+2;
        int small= idx;

        if(left<=n && heap.get(left) > heap.get(small)){
            small = left;
        }
        if(right<=n && heap.get(right) > heap.get(small)){
            small = right;
        }
        if(small==idx) return;
        swap(heap, idx, small);
        pushdown(heap, small,n);
    }
    public static void swap(List<Integer> heap,int l,int r){
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
    }
}
