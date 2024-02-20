
public class SubarrayProductLessthanK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 10;
        int count = countsub(arr, k);
        System.out.println(count);

    }    
    public static int countsub(int[] arr,int k)
    {
        int si =0;
        int ei =0;
        int count = 0;
        int p =1;

        while(ei<arr.length)
        {
            p = p*arr[ei];   //window grow
            
            
            while(p>=k && si<=ei)       //Window Shrink
            {
                p = p/arr[si];
                si++;
            }

            count =count+(ei-si+1);
            ei++;
        }
        return count;
    }
}
