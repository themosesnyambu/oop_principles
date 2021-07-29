package designpatterns.strategydesign;

public abstract class Dog  {
    //A dog ahould have a look
    //A dog should eat 
    // The type of diet may vary 
    //We should separate this from the main
    //A dog should bark
    //The type of bark may vary
    EatBehavior eatBehavior;
    BarkBehavior barkBehavior;
    public abstract void look();
    public void eat(){
        eatBehavior.eat();
    }
    
    public void bark(){
        barkBehavior.bark();
    }
    
}
