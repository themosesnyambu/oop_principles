/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.prototypepattern;

/**
 *
 * @author admin
 */
public interface Animal extends Cloneable{
    //by making clas cloneable you tell java it is okay 
    //to copy instances of this class
    //The instance copies will be stred in different locations in memory
    public Animal makeCopy();
    
}
