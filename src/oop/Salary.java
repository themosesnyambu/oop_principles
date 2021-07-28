package oop;

public class Salary extends Employee {
    private double salary;
    //instantiating the employee class gives us access to the 
    //fieldsand methods in the salary class
    public Salary(String name, String addres, int number) {
        super(name, addres, number);
    }

//Would override the abstract class method    
    @Override
    public double computePay(){
        return salary/52;
    }

    //Must implement all abstract methods in inheriting class
    @Override
    public double computeSalary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
