package classes;

import behaviors_imp.FlyWithWings;
import behaviors_imp.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard Duck!");
    }
}
