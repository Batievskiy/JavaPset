// primitive problem from JavaRush
// Inherit Electric Car from Car and Car from Vehicle
public class InheritanceVehicleCarElectric {

    public static class Vehicle {
        double maxSpeed;
        int wheelCount;
        double weight;
    }

    private static class Car extends Vehicle {

    }

    private static class ElectricCar extends Car {
        int electricEnginePower;
    }
}
