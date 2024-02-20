public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 9;
//1st Way
        int[] arr = new int[32];
        int i=0;
        while(n>0){
            arr[i] = n%2;
            n=n/2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(arr[j]);
        }
        System.out.println();

//2nd Way
        int m= 9;
        String ans = Integer.toBinaryString(m);
        System.out.println(ans);
        // int a = Integer.parseInt(ans);
        // System.out.println(a);
  
        
    }
}
