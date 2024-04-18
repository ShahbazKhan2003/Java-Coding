import java.util.*;

abstract class Employee{
    private String name;

    private int id;

    public Employee(String name , int id){
        this.name = name;
        this.id = id;
    }
    public String getname(){
        return this.name;
    }
    public int getid (){
        return this.id;
    }

    public abstract double calculateSalary();

    public String toString(){
        return "Employee [name=" +name+" , id="+id+",salray = "+calculateSalary()+"]";
    }
}

class FullTimeEmployee extends Employee{
    private double monthlySalary;

    public FullTimeEmployee(String name , int id , double monthlySalary){
        super(name , id);
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary(){
        return this.monthlySalary;
    }
}

class PartTimeEmployee extends Employee{
    private int hoursWorked;

    private double hourlyrate;

    public PartTimeEmployee(String name , int id , int hoursWorked , double hourlyrate){
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyrate = hourlyrate;
    }

    public double calculateSalary(){
        return hoursWorked * hourlyrate;
    }
}
class PayrollSystem{
    private List<Employee> employeeList;

    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void removeEmployee(int id ){
        Employee employeetoRemove = null;

        for(Employee employee : employeeList){
            if(employee.getid() == id){
                employeetoRemove = employee;
                break;
            }
        }
        if(employeetoRemove != null){
            employeeList.remove(employeetoRemove);
        }


    }
    public void displayEMployee(){
        for(Employee employee : employeeList){
            System.out.println(employee);
        }
    }

}



public class EmployeePayroll {
    public static void main(String[] args) {
        
        PayrollSystem payrollSystem = new PayrollSystem();

        FullTimeEmployee emp1 = new FullTimeEmployee("Vikash", 1, 70000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Alexander", 2, 40, 100);


        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println(emp1.getname());

        System.out.println("Intial emp detail: ");
        payrollSystem.displayEMployee();
        
        System.out.println("Remove Employee: ");
        payrollSystem.removeEmployee(2);

        System.out.println("Remaining Employee");
        payrollSystem.displayEMployee();


    }
    
}
