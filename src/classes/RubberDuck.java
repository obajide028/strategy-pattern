package classes;

import Concrete.FlyNoWay;
import Concrete.MuteQuack;

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
