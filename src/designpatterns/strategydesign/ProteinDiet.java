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
public class ProteinDiet implements EatBehavior{
    @Override
    public void eat(){
        System.out.println("Only do meat");
    }
}
