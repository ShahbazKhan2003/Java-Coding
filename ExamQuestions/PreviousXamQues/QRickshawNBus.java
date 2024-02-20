import java.util.Scanner;

public class QRickshawNBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
        int c1=sc.nextInt();
        int c2=sc.nextInt();
        int c3=sc.nextInt();
        int c4=sc.nextInt();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int []rikshaw=new int[n];
        int []bus=new int[m];
        for(int i=0;i<n;i++){
            rikshaw[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            bus[i]=sc.nextInt();
        }
        
        int c=0;
        for(int i=0;i<n;i++ ){
            int temp=Math.min(rikshaw[i]*c1,c2);
            c+=temp;
        }
        int minr=Math.min(c,c3);
        int x=0;
        for(int i=0;i<m;i++){
            int temp2=Math.min(bus[i]*c1,c2);
            x+=temp2;
        }
        int minb=Math.min(x,c3);
        System.out.println(Math.min(minb+minr,c4));

        t--;
    }
}

}