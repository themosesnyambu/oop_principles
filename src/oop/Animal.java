/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author admin
 */
public class Animal {
    
    public String name;
    //Will be private in subclass
    protected String gender;
    //will not be inherited
    private int legs;
    
  
    
    public Animal(){
        
    }
    
    public Animal(String name){
        this.name=name;
    }
    
    public void walks(String movement){
        System.out.println("The animal "+movement);
    }
    
    public static void sound(String sound){
        System.out.println("The animal "+sound);
    }
    //Using final keyword prevents overriding
    public final void eats(){
        System.out.println("The animal must eat");
    }
    
}
