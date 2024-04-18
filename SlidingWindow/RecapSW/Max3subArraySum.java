

public class Max3subArraySum {
    public static void main(String[] args) {
        int[] arr = {100, 200 , 300 ,400};
        int k = 2;
        
        int sti =0;
        int endi = 0;
        int sum = 0;
        int ans = 0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(endi - sti + 1 < k) endi++;

            else if(endi - sti +1 == k){
                ans = Math.max(ans, sum);
                sum -= arr[sti];
                sti++;
                endi++;
            }
        }
        System.out.println(ans);   
    }
}
