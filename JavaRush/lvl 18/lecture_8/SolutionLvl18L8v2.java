// the classes CarZ and BusZ implements VehicleZ
// some of them are the same
// create default methods of that in interface Vehicle
// and remove them from Car and Bus class

public class SolutionLvl18L8v2 {
    public static void main(String[] args) {
        CarZ carZ = new CarZ();
        BusZ busZ = new BusZ();
        System.out.print("car starts -> ");
        carZ.start();
        System.out.print("bus starts -> ");
        busZ.start();
        System.out.print("car moves -> ");
        carZ.move();
        System.out.print("bus moves -> ");
        busZ.move();
        System.out.print("car stops -> ");
        carZ.stop();
        System.out.print("bus stops -> ");
        busZ.stop();
    }
}

interface VehicleZ {
    //TODO
    default void start() {
        System.out.println("start moving");
    }

    void move();

    // TODO
    default void stop() {
        System.out.println("stopping");

    }
}

class CarZ implements VehicleZ {
//    public void start() {
//        System.out.println("start moving");
//    }

    public void move() {
        System.out.println("moving at an average speed of 70 mph");
    }

//    public void stop() {
//        System.out.println("stopping");
//    }
}

class BusZ implements VehicleZ {
//    public void start() {
//        System.out.println("start moving");
//    }

    public void move() {
        System.out.println("moving at an average speed of 50 mph");
    }

//    public void stop() {
//        System.out.println("stopping");
//    }
}