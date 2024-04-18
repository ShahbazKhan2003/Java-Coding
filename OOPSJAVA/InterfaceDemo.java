interface Car{
    public void makebody();
    public void makebrake();
    
}
class Tata implements Car{
    public void makebody(){
        System.out.println("Body is ready");
    }
    public void makebrake(){
        System.out.println("Brake is ready");
    }
}
class Kia implements Car{
    public void makebody(){
        System.out.println("Body is not ready");
    }
    public void makebrake(){
        System.out.println("Brake is not ready");
    }
}
    
public class InterfaceDemo {
    public static void main(String[] args) {
        Car obj = new Tata();
        Car obj1 = new Kia();
        obj.makebody();
        obj1.makebody();
        
    }
}
