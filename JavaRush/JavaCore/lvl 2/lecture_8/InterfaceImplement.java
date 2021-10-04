public class InterfaceImplement {
}

interface Movable {
    void move(String newAddress);
}

interface Drivable {
    void drive(Driver driver);
}

interface Transport {
    void addStuff(Object stuff);
    Object removeStuff();
}

class Wheel implements Movable {
    @Override
    public void move(String newAddress) {
        System.out.println("Wheel moves to address : " + newAddress);
    }
}

// class Car has to override all the methods of implemented interfaces
class Car implements Movable, Drivable, Transport {
    @Override
    public void move(String newAddress) {
        System.out.println("Car moves to address : " + newAddress);
    }
    @Override
    public void drive(Driver driver) {
        System.out.println("Driver : " + driver + " drives the car.");
    }
    @Override
    public void addStuff(Object stuff) {
        System.out.println("added some stuff into the car.");
    }
    @Override
    public Object removeStuff() {
        return new Object();
    }

}

class Driver {

}
