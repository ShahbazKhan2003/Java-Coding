public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        tower(n,'A','C','B');        
    }
    public static void tower(int n , char from , char to , char aux){
        if(n==0) return;

        tower(n-1, from, aux, to);
        System.out.println("Take disk " + n + " from rod " + from + " to rod " + to );
        tower(n-1, aux, to, from);
    }
}
