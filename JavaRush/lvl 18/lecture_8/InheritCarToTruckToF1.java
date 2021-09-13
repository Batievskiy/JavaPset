public class InheritCarToTruckToF1 {
    public static void main(String[] args) {

        String model = "F1";
        int maxSpeed = 450;
        int year = 1967;

        F1Car formula1Car = new F1Car(model, maxSpeed, year);
        formula1Car.gas();
        formula1Car.pitStop();
        formula1Car.brake();
        formula1Car.printCarInfo();
    }
}

class Car {

    private String model;
    private int maxSpeed;
    private int yearOfManufacture;

    public Car(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void gas() {
        // TODO
    }

    public void brake() {
        // TODO
    }

    public void printCarInfo() {
        System.out.println("Car model -> " + this.model);
        System.out.println("maxSpeed -> " + this.maxSpeed + " mph");
        System.out.println("year -> " + this.yearOfManufacture);
    }
}

class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }
}

class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }
}

class F1Car extends Car {
    public F1Car(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    public void pitStop() {
        // TODO
    }
}
