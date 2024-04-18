
abstract class Car{
    abstract public void fueltype(); 
    public void color(){
        System.out.println("Black");
    }
}
class Tata extends Car{
    public void fueltype(){
        System.out.println("Diesel");
    }
}
public class Lect1 {
    public static void main(String[] args) {
        Tata obj = new Tata();
        obj.fueltype();
        obj.color(); 

    }
}
