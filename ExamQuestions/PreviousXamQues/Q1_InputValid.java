import java.util.Scanner;

public class Q1_InputValid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String val = sc.next();
            for(int i=0;i<val.length();i++){
                if(val.charAt(i) >=65 && val.charAt(i) <= 122) continue;
                else{
                    System.out.print("INvalid Name");
                    break;
                }
            }
            int id = sc.nextInt();
            if(id<=0){
                System.out.println("Invalid Id");
                break;
            }
            double sal = sc.nextDouble();
            if(sal<0){
                System.out.println("Invalid salary");
                break;
            }

            System.out.println("Prefect");
        }
    }
}
