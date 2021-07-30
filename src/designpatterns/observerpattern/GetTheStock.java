/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.observerpattern;

import java.text.DecimalFormat;

/**
 *
 * @author admin
 */
public class GetTheStock implements Runnable{
    
    private int startTime;
    private String tock;
    private double price;
    private Subject stockGrabber;

    public GetTheStock(int startTime, String tock, double price, Subject stockGrabber) {
        this.startTime = startTime;
        this.tock = tock;
        this.price = price;
        this.stockGrabber = stockGrabber;
    }
    
    @Override
    public void run() {
        for(int i=1; i<=20; i++){
            try{
                Thread.sleep(2000);
            } catch(InterruptedException e){}
            
            double randNo = (Math.random() * (.06))-.03;
            DecimalFormat df = new DecimalFormat("#.##");
            price  = Double.valueOf(df.format(price+randNo));
            
            if(tock =="IBM") ((StockGrabber)stockGrabber).setIBMPrice(price);
            if(tock =="AAPL") ((StockGrabber)stockGrabber).setAAPLPrice(price);
            if(tock =="GOOG") ((StockGrabber)stockGrabber).setGOOGPrice(price);
            
            System.out.println(tock+": "+df.format((price+randNo))+" "+df.format(randNo));
            System.out.println();
        }
    }
    
}
