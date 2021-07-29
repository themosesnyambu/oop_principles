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
public class DogImpl {
    public static void main(String[] args){
        //Programming to an interface        
        Dog chi = new Chihuahua();
        chi.bark();
    }
    
}
