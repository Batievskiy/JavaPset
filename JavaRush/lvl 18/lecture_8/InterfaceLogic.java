public class InterfaceLogic {
}

// this interface is responsible for movement of the object
interface Movable {
    void move(String newAddress);
}

// this interface is responsible for the ability to drive an object
interface Drivable {
    void drive(Driver driver);
}

// this class represents Driver object
class Driver {
    public void getName() {
        System.out.println("I'm the Driver");
    }
}

// this interface is responsible for the ability to transport goods
interface Transport {
    void addStaff(Object staff);

    Object removeStaff();
}

// this class has ability to move
class Wheel implements Movable {
    @Override
    public void move(String newAddress) {
        System.out.println("moving");
    }
}

// this class has ability to move, be drivable and to transport goods
class Car implements Movable, Drivable, Transport {
    @Override
    public void move(String newAddress) {
        System.out.println("address changed");
    }

    @Override
    public void drive(Driver driver) {
        System.out.println("driving");
    }

    @Override
    public void addStaff(Object staff) {
        System.out.println("staff added");
    }

    @Override
    public Object removeStaff() {
        return new Object();
    }
}