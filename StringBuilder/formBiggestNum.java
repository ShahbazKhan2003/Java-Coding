import java.util.*;

public class formBiggestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalcases = sc.nextInt();

        while(totalcases!=0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }

            int swap=0;

            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    String ij = String.valueOf(arr[i]) + String.valueOf(arr[j]);
                    String ji = String.valueOf(arr[j]) + String.valueOf(arr[i]);

                     

                    if(Integer.parseInt(ji) > Integer.parseInt(ij))
                    {
                        swap=arr[i];
                        arr[i]=arr[j];
                        arr[j]=swap;
                    }
                }
            }

            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            }


            totalcases--;
        }

       


        // int[] arr = { 54,546,548,60 };
        // // Output = 853032
        // int t = 0;
        // for (int i = 0; i < arr.length; i++) {

        //     for (int j = i + 1; j < arr.length; j++) {

        //         String ij = String.valueOf(arr[i]) + String.valueOf(arr[j]);
        //         String ji = String.valueOf(arr[j]) + String.valueOf(arr[i]);

        //         System.out.println("ij: " + ij);
        //         System.out.println("ji: " + ji);
        //         if (Integer.parseInt(ji) > Integer.parseInt(ij)) {
        //             t = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = t;
        //         }

        //     }

        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]);
        // }
    }
}
