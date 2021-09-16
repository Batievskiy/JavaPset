public class InterfaceDefaultMethods {
    public static void main(String[] args) {
        // Car car = new Car(); // Car is abstract; cannot be instantiated!

        Sedan sedan = new Sedan();
        Truck truck = new Truck();
        F1Car f1Car = new F1Car();

        sedan.gas();
        truck.gas();
        f1Car.gas();

        sedan.brake();
        truck.brake();
        f1Car.brake();
    }
}

interface Car {

    // default methods in interface has its body and implementation.
    // so - the classes that implements this interface
    // don't have to implement default methods from interface
    // only if they are has to be changed (Override)
    default void gas() {
        System.out.println("Car - gas!");
    };

    default void brake() {
        System.out.println("Car - brake!");
    }
}

class Sedan implements Car {
}

class Truck implements Car {
    // if is needed to change default method - just override it
    @Override
    public void brake() {
        System.out.println("I'm the Truck - I'm NOT brake!!!");
    }
}

class F1Car implements Car {
    // if is needed to change default method - just override it
    @Override
    public void gas() {
        System.out.println("I'm not a Car - I'm super F1Car - GAS!!!");
    }
}