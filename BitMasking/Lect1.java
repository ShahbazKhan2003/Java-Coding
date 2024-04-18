class Lect1{
    public static void main(String[] args) {
//Find unique number
//         int[] arr = {2,1,2,5,6,5,7,7,6};
//         int ans = 0;

//         for(int i=0;i<arr.length;i++){
//             ans = ans ^ arr[i];
//         }
//         System.out.println(ans);
 // Swap two number 
//         int a = 5;
//         int b = 7;
         
//         System.out.println( a +" " + b);
//         a = a^b;
//         b = a^b;
//         a = a^b;
//         System.out.println( a +" " + b);

        // Xor all the number between 1-N
        int ans1 = 0;
        int n = 7;
        for(int i=1;i<=n;i++){
            ans1 = ans1 ^ i ;
        }

        System.out.println(ans1);
         
        if(n%4==0) System.out.println(n);
        else if(n%4==1) System.out.println(1);
        else if(n%4==2) System.out.println(n+1);
        else if(n%4==3) System.out.println(0);
    }
}