// add interfaces to class Dog, Car, Duck and Airplane

public class SolutionLvl2L9v2 {
    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanMove {
        void move();
    }

    public interface CanEat {
        void eat();
    }

    public class Dog implements CanMove, CanEat {
        public void move() {

        }
        public void eat() {

        }
    }

    public class Duck implements CanMove, CanFly, CanEat {
        public void move() {

        }

        public void fly() {

        }

        public void eat() {

        }
    }

    public class Car implements CanMove {
        public void move() {

        }
    }

    public class Airplane implements CanMove, CanFly {
        public void move() {

        }

        public void fly() {

        }
    }
}
