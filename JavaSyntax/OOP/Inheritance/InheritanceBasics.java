// what is Inheritance in Java?
// let's find out
public class InheritanceBasics {

    // Inheritance is the mechanism in Java by which one class is allowed
    // to inherit the features (fields and methods) of another class.

    // Super Class - the class whose features are inherited is known as a superclass
    // (or a base class or a parent class).

    // Sub Class - the class inherits the other class is known as a subclass
    // (or a derived class, extended class, or child class).
    // The subclass can add its own fields and methods in addition to the superclass fields and methods.

    // Reusability - Inheritance supports the concept of "reusability",
    // i.e. when we want to create a new class and there is already a class that includes some of the code
    // that we want, we can derive our new class from the existing class.
    // By doing this. we are reusing the fields and methods of the existing class.
    /*

    class derived-class extends base-class {
        // a subclass body
        // fields
        // methods
    }

    */
    // let's try this out!

    static class Bicycle {

        // the Bicycle Super Class has two fields:
        public int gear;
        public int speed;

        // the Bicycle Super Class has one constructor
        public Bicycle(int gear, int speed) {
            this.gear = gear;
            this.speed = speed;
        }

        // the Bicycle Super Class has three methods

        // method to use brakes
        public void applyBreak(int decrement) {
            speed -= decrement;
        }

        // method to increase speed
        public void speedUp(int increment) {
            speed += increment;
        }

        // and method to print Bicycle info
        public String printInfo() {
            return ("Number of gears are: " + gear + "\n"
                    + "speed of bicycle is: " + speed);
        }
    }

    // and let's create derived class
    static class MountainBike extends Bicycle {

        // the MountainBike Sub Class adds one more field
        public int seatHeight;

        // the MountainBike Sub Class has one constructor
        public MountainBike(int gear, int speed, int startHeight) {

            // invoking base-class(Bicycle) constructor
            super(gear, speed);
            seatHeight = startHeight;
        }

        // the MountainBike subclass adds one more method
        public void setHeight(int newValue) {
            seatHeight = newValue;
        }

        // overriding printInfo() method
        // of Bicycle to print more info
        @Override public String printInfo() {
            return (super.printInfo() + "\nseat height is: " + seatHeight);
        }
    }

    // ant let's use all this classes in main
    public static void main(String[] args) {

        MountainBike mb = new MountainBike(3, 0, 25);
        System.out.println("---< starting position >---");
        System.out.println(mb.printInfo());
        System.out.println(); // new line

        // changing seat height
        mb.setHeight(10);
        System.out.println("seat height after changes: " + mb.seatHeight);

        // changing speed
        int speedUp = 25;
        mb.speedUp(speedUp);
        System.out.println("speed increased by: " + speedUp);

        // using brakes to speed down
        int brakeForce = 25;
        mb.applyBreak(brakeForce);
        System.out.println("bicycle has stopped after braking!");
        System.out.println(); // new line
        System.out.println(mb.printInfo());
    }
}
