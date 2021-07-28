package oop;

public class AbstractImpl {

    public static void main(String[] args) {
//        Compile time error 
//        Abstract class cannot be instantiated
//        Employee employee = new Employee("Jay", "Voi", 1234);


//Gives us Employee reference without directly instantiating
        Employee e = new Salary("Olmo", "two street", 0);
        e.mailCheck();
    }

}
