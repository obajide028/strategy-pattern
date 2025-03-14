package classes;

import behaviors_imp.FlyNoWay;
import behaviors_imp.MuteQuack;

public class RubberDuck extends Duck{

    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I am a Rubber Duck!");
    }
}
