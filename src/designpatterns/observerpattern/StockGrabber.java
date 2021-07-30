/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.observerpattern;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class StockGrabber implements Subject{

    private ArrayList<Observer> observerList; 
    private double ibmPrice;
    private double aaplePrice;
    private double googPrice;

    public StockGrabber() {
        this.observerList = new ArrayList<Observer>();
    }
    
    
    @Override
    public void registerOberver(Observer o) {
        this.observerList.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        int observerIndex = this.observerList.indexOf(o);
        this.observerList.remove(observerIndex);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observerList){
            observer.update(ibmPrice, aaplePrice, googPrice);
        }
    }
    
    public void setIBMPrice(double newIBMPrice){
        this.ibmPrice = newIBMPrice;
        this.notifyObservers();
    }
    
    public void setAAPLPrice(double newAAPLPrice){
        this.aaplePrice = newAAPLPrice;
        this.notifyObservers();
    }
    
    public void setGOOGPrice(double newGOOGPrice){
        this.googPrice = newGOOGPrice;
        this.notifyObservers();
    }
    
}
