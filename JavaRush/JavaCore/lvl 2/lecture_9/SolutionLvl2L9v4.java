// create public class Human and public interface CanRun and CanSwim
// add one method into each interface
// add this interfaces into class Human
// declare class Human abstract

public class SolutionLvl2L9v4 {
    public static void main(String[] args) {

    }

    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }

    public abstract class Human implements CanRun, CanSwim {

    }
}
