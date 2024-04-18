
class Bank{
    public void interest(){
        System.out.println("Bank Interest");
    }
}

class Sbi extends Bank{
    
    public void interest(){
        System.out.println("SBI Interest");
    }
}
class Pnb{
    
    public void interest(){
        System.out.println("PNB Interest");
    }
}
class Hdfc{
    
    public void interest(){
        System.out.println("HDFC Interest");
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {
        Sbi obj = new Sbi();
        Pnb obj1 = new Pnb();
        obj.interest();
        obj1.interest();

    }
}
