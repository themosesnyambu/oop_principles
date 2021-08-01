/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.abstractfactorypattern;

/**
 *
 * @author admin
 */
public class FactoryProducer {
   public static AbstractFactory getFactory(boolean rounded){
       if(rounded){
           return new RoundedFactory();
       }else{
           return new ShapeFactory();
       }
   } 
}
