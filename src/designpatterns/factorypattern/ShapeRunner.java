/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.factorypattern;

/**
 *
 * @author admin
 */
public class ShapeRunner {
    public static void main(String [] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = null;
        shape = shapeFactory.getShape("rect");
        shape.draw();
    }
}
