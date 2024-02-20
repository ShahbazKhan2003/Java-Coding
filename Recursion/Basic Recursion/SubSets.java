public class SubSets {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        sol(arr,0,"");
    }
    public static void sol(int[] arr,int i,String s){
        if(i==arr.length) {
            System.out.println(s);
            return;
        }
        sol(arr,i+1,s+arr[i]+" ");
        sol(arr,i+1,s);
    }
}
