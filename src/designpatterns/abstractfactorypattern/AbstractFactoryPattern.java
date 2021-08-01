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
public class AbstractFactoryPattern {
    public static void main(String[] args){
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("rect");
        shape1.draw();
    }
    
}
