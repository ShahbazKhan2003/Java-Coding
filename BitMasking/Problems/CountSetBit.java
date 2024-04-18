public class CountSetBit {
    public static void main(String[] args) {
        int n = 13;

        int cnt =0;
        while(n!=0){
            int mask = n & 1;
            if(mask==1) cnt++;
            n = n>>1; 
        }
        System.out.println(cnt);

        int cnt2 =0;

//Second Way        

        int m =  13;

        while (m!=0) {
            m = m & (m-1);
            cnt2++;
        }
        System.out.println(cnt2);
    }
}
