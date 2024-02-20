import java.util.*;
public class CountSort {
    public static void main(String[] args) {
        int[] arr = {4,3,4,-1,2,1,-5,2};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i:arr){
            min=Math.min(min, i);
            max=Math.max(max, i);
        }
        int[] freq = new int[max-min+1];
        for(int i:arr){
            freq[i-min]++;
        }
        int k=0;
        for(int j=0;j<freq.length;j++){
            while(freq[j]!=0){
                arr[k++]=j+min;
                freq[j]--;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
