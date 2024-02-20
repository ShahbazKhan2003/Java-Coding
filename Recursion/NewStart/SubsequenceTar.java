import java.util.ArrayList;
import java.util.List;

public class SubsequenceTar{
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int tar = 2;
        List<Integer> a = new ArrayList<>();
        // AllsubwithsumK(arr,tar,0,0,a);
        // AnyOneSub(arr,tar,0,0,a);
       System.out.println(countSub(arr,tar,0,0,a));
    }
    public static void AllsubwithsumK(int[] arr,int tar,int s,int i,List<Integer> a){
        if(i>=arr.length){
            if(s==tar){
                System.out.println(a);
            }
            return;
        }
        a.add(arr[i]);
        s += arr[i];
        AllsubwithsumK(arr, tar, s, i+1,a);

        a.remove(a.size()-1);
        s -=arr[i];

        AllsubwithsumK(arr, tar, s, i+1, a);
    }

    //
      public static boolean AnyOneSub(int[] arr,int tar,int s,int i,List<Integer> a){
        if(i>=arr.length){
            if(s==tar){
                System.out.println(a);
                return true;
            }
            else return false;
        }
        a.add(arr[i]);
        s += arr[i];
        if(AnyOneSub(arr, tar, s, i+1,a)) return true;

        a.remove(a.size()-1);
        s -=arr[i];

        if(AnyOneSub(arr, tar, s, i+1, a)) return true;
        
        return false;
    }
    public static int countSub(int[] arr,int tar,int s,int i,List<Integer> a){
        if(i>=arr.length){
            if(s==tar) return 1;
            else return 0;
        }
        s+=arr[i];
        // a.add(arr[i]);
        int c1 = countSub(arr, tar, s, i+1, a);
        // a.remove(a.size()-1);
        s-=arr[i];
        int c2 = countSub(arr, tar,s, i+1, a);

        return c1+c2;
    }
}