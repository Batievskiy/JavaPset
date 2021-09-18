// method onlyElectricCars(ArrayList<Car>)
// - filters the list of Cars received as argument
// - returns Stream of filtered Cars only with inElectric == true

// HINT:
// use .filter() method of an object type Stream<Car>

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class SolutionLvl19L4v1 {
    public static void main(String[] args) {
        ArrayList<Car> carArrayList = new ArrayList<>();
        Collections.addAll(carArrayList,
                new Car("Range Rover", false),
                new Car("Model S", true),
                new Car("Navigator", false),
                new Car("Model 3", true),
                new Car("Camaro", false),
                new Car("Escalade", false),
                new Car("Mustang", false),
                new Car("Model X", true),
                new Car("X5", false),
                new Car("Model Y", true)
        );

        Stream<Car> carStream = onlyElectricCars(carArrayList);
        carStream.forEach(System.out::println);
    }

    public static Stream<Car> onlyElectricCars(ArrayList<Car> cars) {
        return cars.stream()
                .filter(Car::isElectric);
    }
}

class Car {
    private String model;
    private boolean isElectric;

    public Car(String model, boolean isElectric) {
        this.model = model;
        this.isElectric = isElectric;
    }

    public String getModel() {
        return model;
    }

    public boolean isElectric() {
        return isElectric;
    }

    @Override
    public String toString() {
        return "Car " + this.model + " is electric - " + isElectric();
    }
}