import classes.Duck;
import classes.MallardDuck;
import classes.RubberDuck;
public class Main {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

    }
}