package oop;

public abstract class Employee {
    private String name;
    private String address;
    private int number;
    
    public Employee(String name, String addres, int number){
        //An Abstract class can have a constructor
        this.name = name;
        this.address = addres;
        this.number = number;
    }
    
    public double computePay(){
        return 0.0;
    }
    
    public void mailCheck(){
        System.out.println("Mailing check to "+this.name+" at "+this.address);
    }
    
    
    //An abstract method
    public abstract double computeSalary();
    
    
}
