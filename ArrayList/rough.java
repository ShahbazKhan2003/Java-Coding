import java.util.*;
public class rough {
    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(100);
        // arr.add(10);
        // arr.add(90);
        // arr.add(50);
        // arr.add(89);
        // System.out.println(arr);
        // arr.remove(3);
        // System.out.println(arr);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++) arr.add(sc.nextInt());
        List<Integer> ref = arr;
        Collections.sort(ref,(a,b)->b-a);
        int i=0;
        while(k!=0){
            if(ref.get(i) != arr.get(i)){
                int val = arr.get(i);
                arr.remove(i);
                int idx = arr.indexOf(ref.get(i));
                arr.add(i,ref.get(i));
                arr.set(idx, val);
            } 
            i++;
            k--;
        }

        for(int j=0;j<n;j++) System.out.print(arr.get(j) + " ");

    }
}
