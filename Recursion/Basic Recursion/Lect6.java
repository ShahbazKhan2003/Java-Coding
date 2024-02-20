public class Lect6 {
//     public static void main(String[] args) {
// //PrintAll Ele
//         int[] arr = {3,4,5,8,9};
//         int i = 0;
//         printarr(arr,i);
//     }
//     public static void printarr(int[] arr,int i)
//     {
        
//         if(i==arr.length) return;

//         System.out.print(arr[i] +" ");

//         printarr(arr, i+1);
        
//     }


    public static void main(String[] args) {
        int[] arr = {3,10,9,7};
        int i =0;
        System.out.println(Max(arr,i));
        System.out.println(Sum(arr,i));
        
    }    
// Maxi in array
    public static int Max(int arr[],int i)
    {
        if(i == arr.length-1) return arr[i];
        
        int ans = Max(arr, i+1);
        
        return Math.max(ans, arr[i]);
    }
    
//Sum of Elements
    public static int Sum(int[] arr,int i)
    {
        // if(i==arr.length) return 0;
        if(i == arr.length-1) return arr[i];

        int sum = Sum(arr, i+1);

        return sum+arr[i];
    }

}
