/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.prototypepattern;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Sheep implements Animal{
    public Sheep(){
        System.out.println("sheep is made");
    }
    
    public Animal makeCopy(){
        System.out.println("Sheep is Being made");
        Sheep sheepObject = null;
        
        try {
            sheepObject =(Sheep) super.clone();
        } catch (CloneNotSupportedException ex) {
            //The exception is thrown if you try to clone an object that
            //does not extend clone
            Logger.getLogger(Sheep.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sheepObject;
    }
    
    public String toString(){
        return "Dolly is my hero baaa";
    }
}
