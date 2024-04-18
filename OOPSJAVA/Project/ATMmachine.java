import java.util.*;
class ATM{
    float balance;
    int pin = 1234;

    // public void checkpin(){
    //     System.out.println("Enter your Pin: ");
    //     Scanner sc = new Scanner(System.in);
    //     int enterpin = sc.nextInt();
    //     if(enterpin == pin){
    //         menu();
    //     }
    //     else{
    //         System.out.println("Plzz Enter correct Pin");
    //         menu();
    //     }
    // }

    ATM(int enterpin){
        if(this.pin == enterpin){
            menu();
        }
        else{
            System.out.println("Plzz Enter correct PIN: ");
            System.out.println();
            menu();
        }
    }
    public void menu(){
        System.out.println("Enter your Choice ");
        System.out.println("1 for A/C Balance ");
        System.out.println("2 for Withdrawl ");
        System.out.println("3 for Deposit Money");
        System.out.println("4 for EXIT");

        Scanner sc = new Scanner(System.in);
        int press = sc.nextInt();
        if(press==1){
            checkbalance();
            menu();
        }
        else if(press==2){
            Withdrawlmoney();
        }
        else if(press==3){
            Depositmoney();
        }
        else if(press == 4){
            return;
        }
        else{
            System.out.println("Enter a Valid Choice");
            menu();
        }
    }
    public void checkbalance(){
        System.out.println("Your Balance is: " + balance);
        menu();
    }
    public void Withdrawlmoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amt: ");
        float amt = sc.nextInt();
        
        if(amt > balance){
            System.out.println("Insufficent Balance");
        }
        else{
            balance = balance - amt;
            System.out.println("Money Withdrawal Successfully");
        }
        menu();
    }
    public void Depositmoney(){
        System.out.println("Enter your amt: ");
        Scanner sc = new Scanner(System.in);
        float amt = sc.nextInt();

        balance += amt;
        System.out.println("Money Deposited Successfully");

        
    }

}
public class ATMmachine {
    public static void main(String[] args) {
        ATM obj = new ATM(1334);
        // obj.checkpin();
    }
}
