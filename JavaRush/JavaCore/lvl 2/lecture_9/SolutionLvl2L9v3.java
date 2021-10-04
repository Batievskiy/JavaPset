// add interfaces to class Human, Duck, Penguin, Airplane

public class SolutionLvl2L9v3 {
    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }

    public class Human implements CanRun, CanSwim {
        public void run() {

        }

        public void swim() {

        }
    }

    public class Duck implements CanRun, CanSwim, CanFly {
        public void run() {

        }

        public void swim() {

        }

        public void fly() {

        }
    }

    public class Penguin implements CanRun, CanSwim {
        public void run() {

        }

        public void swim() {

        }
    }

    public class Airplane implements CanFly {
        public void fly() {

        }
    }
}
