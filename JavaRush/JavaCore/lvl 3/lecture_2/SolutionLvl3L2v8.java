// create an interface CanMove with a method speed()
// make speed() to return Double
// create an interface CanFly inherited from CanMove
// add the method speed() into the interface CanFly
// be sure that speed() returns Double and takes one parameter
// type CanFly

public class SolutionLvl3L2v8 {
    public static void main(String[] args) {

    }

    interface CanMove {
        Double speed();
    }

    interface CanFly extends CanMove {
        Double speed(CanFly canFly);
    }
}
