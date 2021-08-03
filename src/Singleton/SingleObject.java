/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author admin
 */
public class SingleObject {
    
    //create an object ofSingleObject
    private static SingleObject instance = new SingleObject();
    //private constructor prevents instantiating
    private SingleObject(){}
    
    //Get the only object available
    public static SingleObject getInstance(){
        return instance;
    }
}
