/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.observerpattern;

/**
 *
 * @author admin
 */
public class GrabStocks {
    public static void main(String[] arg){
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver oberver1 = new StockObserver(stockGrabber);
        stockGrabber.setIBMPrice(100.2);
        stockGrabber.setAAPLPrice(20.3);
        stockGrabber.setGOOGPrice(56.4);
    }
    
}
