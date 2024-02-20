
public class SearchRotated {
    public static void main(String[] args) {
        int[] arr = {10,11,12,1,2,3,4,5,6,7};

        int target = 120    ;
        int check = search(arr,target);
        System.out.println(check);
    }
    public static int search(int[] arr,int tar){
        int s =  0;
        int e = arr.length-1;
     
        while(s<=e){
            int mid = s+(e-s)/2;

            if(arr[mid]== tar) {
               return mid;
            }
            else if( arr[mid] < arr[e]){
                if(tar > arr[mid] && tar <= arr[e]){
                    s = mid+1;
                }
                else e=mid-1;
            }
            else{
                if(tar>=arr[s] && tar < arr[mid]){
                    e=mid-1;
                }
                else s=mid+1;
            }
        }
        return -1;
    }
}
