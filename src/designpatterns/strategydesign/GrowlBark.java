/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.strategydesign;

/**
 *
 * @author admin
 */
public class GrowlBark implements BarkBehavior{

    @Override
    public void bark() {
        System.out.println("This one growls");
    }
    
}
