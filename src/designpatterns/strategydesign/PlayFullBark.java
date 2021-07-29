package designpatterns.strategydesign;

public class PlayFullBark implements BarkBehavior{

    @Override
    public void bark() {
        System.out.println("playfull bark");
    }
    
}
