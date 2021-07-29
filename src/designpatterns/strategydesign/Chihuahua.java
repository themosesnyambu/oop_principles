package designpatterns.strategydesign;

public class Chihuahua extends Dog{
    public Chihuahua(){
        barkBehavior = new GrowlBark();
    }
    
    @Override
    public void look() {
    }    
}
