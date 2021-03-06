package oop;

public class Dog extends Animal{
    
    public Dog(){
        
    }
    
    public Dog(String name){
        this.name =name;
        //Protected in Super class becomes private in subclass
        this.gender ="male";
    }
    
    
    
    //Hides the parent static method
    public static void sound(String sound){
        System.out.println("The dog "+sound);
    }
    
    //Dynamic Polymorphism
    //Overrides the parent method
    @Override
    public void walks(String movement){
        System.out.println("The dog "+movement);
    }
    
    //Static Polymorphism
    //Overloading, same name different signature
    public void walks(String movement, String baby_movement){
        System.out.println("The dog "+movement);
    }
    
    //calling parent method directly using super keyword
    public void callP(){
        super.walks("called parent method");
    }
        
    //cannot ocverride parent because its final
//    public void eats(){}
    
    //Compile time error 
    //Static cannot override non static method
//    public static void walks(String movement){
//        
//    }
    
    public static void main(String[] args){
        Dog myDog = new Dog();
        Animal animal = new Dog();
        myDog.sound("barks");
        myDog.callP();
        animal.sound("chirps");

    }
    
}
