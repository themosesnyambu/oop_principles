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
public class ShapeFactory {
    
    public Shape getShape(String shapeType){
        if(shapeType.equals("rect")){
            return new Rectangle();
        }else if(shapeType.equals("square")){
            return new Square();
        }else{
            return null;
        }
    }
}
