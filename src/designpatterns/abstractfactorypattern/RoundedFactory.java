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
public class RoundedFactory extends AbstractFactory{

    @Override
    Shape getShape(String shapeType) {
        if(shapeType.equals("roundedrect")){
            return  new RoundedRectangle();
        }else if(shapeType.equals("roundedSquare")){
            return new RoundedSquare();
        }
        return null;
    }
    
    
}
