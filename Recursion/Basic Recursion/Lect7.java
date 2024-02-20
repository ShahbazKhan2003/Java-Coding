import java.util.ArrayList;

public class Lect7 {
    public static void main(String[] args) {
//Linear Search
        int[] arr = {1,2,5,4,5};
        int n = 8;
        int x = 5;
        int i =0;
        if(linear(arr, i, x) == true)
        {
            System.out.println("Yes");
        }
        else System.out.println("No");

//Return the index of the ele 
        System.out.println(linearIndex(arr, i, x));

//Find all the index
        ArrayList<Integer> ans = FindAllIndices(arr,i,x);
        System.out.println(ans);

//Check its Sorted Array or not
        System.out.println(checkSorted(arr, i));

//Find lastIndex of target
        System.out.println(lastIndex(arr,i=arr.length-1,x));
        
    }
    public static boolean linear(int[] arr,int i,int x)
    {
        if(i == arr.length)
        {
            return false;
        }

        if(arr[i] == x) return true;

        return linear(arr,i+1,x);        
    }
    public static int linearIndex(int[] arr,int i,int x)
    {
        if(i == arr.length)
        {
            return -1;
        }
        
        if(arr[i] == x) return i;

        return linearIndex(arr, i+1, x);
    }

    public static ArrayList<Integer> FindAllIndices(int[] arr,int i,int x)
    {
        ArrayList<Integer> al = new ArrayList<>();
        if(i == arr.length)
        {
           return new ArrayList<>();
        }

        if(arr[i] == x) 
        {
            al.add(i);
        }
        
        ArrayList<Integer> ans = FindAllIndices(arr, i+1, x);

        al.addAll(ans);

        return al;
    }

    public static boolean checkSorted(int[] arr,int i)
    {
        if(i == arr.length-1) return true;

        if(arr[i] > arr[i+1]) return false;

        return checkSorted(arr, i+1);
    }

    public static int lastIndex(int[] arr,int idx,int target)
    {
        // if(i == arr.length)
        // return -1;

        // int lastIndex = lastIndex(arr, x, i+1);
             
        // if(arr[i]==x && i>lastIndex)
        //     return i;
        // else
        //     return lastIndex;

        if(idx < 0) return -1;
        
        // self work
        if(arr[idx] == target)  return idx;

        // recursive work
        return lastIndex(arr, target, idx-1);
    }
}
