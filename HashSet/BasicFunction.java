import java.util.*;
public class BasicFunction {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(45);
        h.add(55);
        h.add(35);
        h.add(85);
        h.add(85);
        System.out.println(h);
        System.out.println(h.contains(35));
        System.out.println(h.size());
        h.remove(35);
        System.out.println(h);
    
        for(var i:h){
            System.out.println(i);
        }

        

        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();

        // while(t!=0){
        //     int n = sc.nextInt();
        //     int[] arr = new int[n];
        //     for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        //     int q = sc.nextInt();
        //     HashSet<Integer> h = new HashSet<>();
        //     for(int i=0;i<n;i++) h.add(arr[i]);
        //     while(q!=0){
        //         int a = sc.nextInt();
        //         if(h.contains(a)){
        //             System.out.println("Yes");
        //         }
        //         else System.out.println("NO");
        //         q--;
        //     }



        //     t--;
        // }
       
       
    }
}
