import java.util.Scanner;

public class PaintFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfFences = sc.nextInt();
        int noOfColor = sc.nextInt();

        long same = noOfColor * 1;              //Last 2 end with same color
        long diff = noOfColor * (noOfColor-1);  //Last 2 end with diff color
        long sum = same + diff;

        for(int i=3;i<=noOfFences;i++){
            same = diff*1;                        // diff will be permutation
            diff = sum*(noOfColor-1);            // total*(rest of that color)
            sum = same + diff;
        }
        System.out.println(sum);
    }
}
