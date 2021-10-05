public class AbstractClassCar {

    public static void main(String[] args) {
        // an abstract class cannot be instantiated
        // so... Car car = new Car(); // - this is an Error
        Car sedan = new Sedan("Tesla Model-X");
        System.out.println(sedan.toString());

    }
}

// simple abstract class
abstract class Car {

    private String model;
    private String color;
    private int maxSpeed;

    public Car(String model) {
        this.model = model;
    }

    public abstract void gas();

    public abstract void brake();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "car's model : " + model;
    }
}

class Sedan extends Car {

    public Sedan(String model) {
        super(model);
    }

    @Override
    public void gas() {
        System.out.println("Sedan is revs loudly");
    }

    @Override
    public void brake() {
        System.out.println("Sedan is braking");
    }
}
