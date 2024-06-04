import java.util.Arrays;
import java.util.Scanner;

class Job{
    int id , deadline , profit;
    public Job(int id , int d , int p){
        this.id = id;
        this.deadline = d;
        this.profit = p;
    }
}

public class jobScheduling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Job[] arr = new Job[5];

        for (int i = 0; i < 5; i++) {
            int id = sc.nextInt();
            int deadline = sc.nextInt();
            int profit = sc.nextInt();
            arr[i] = new Job(id, deadline, profit);
        }

        Arrays.sort(arr , (a,b)->{
            return b.profit - a.profit;
        });

        int maxD = 0 , maxP =0 , count=0;
        for(int i=0;i<5;i++) maxD = Math.max(maxD, arr[i].deadline);

        int[] dead = new int[maxD+1];
        Arrays.fill(dead, -1);

        for(int i=0;i<5;i++){
            for(int j=arr[i].deadline;j>0;j--){
                if(dead[j]==-1){
                    maxP += arr[i].profit;
                    count++;
                    dead[j] = i;
                    break;
                }
            }
        }
        System.out.println(maxD);
        System.out.println(count);
        
    }
}
