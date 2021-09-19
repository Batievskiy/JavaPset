// method getMostExpensiveCar(Stream<Car>) - finds most expensive Car in the list
// method getMoreExpensiveCar(Stream<Car>, Car) - finds a Car that most expensive
// compare to found Car from first list.
// these methods return an object type Optional<Car>

// HINT: to search an element with max value - use method .max()
// to search first fits element in Stream use .findFirst()

import java.util.Comparator;
import java.util.stream.Stream;
import java.util.Optional;

public class SolutionLvl19L6v3 {
    public static void main(String[] args) {
        Stream<Car> tesla = Stream.of(
                new Car("Model S", 94_490),
                new Car("Model 3", 50_690),
                new Car("Model X", 99_690),
                new Car("Model Y", 65_000)
        );

        Stream<Car> bmw = Stream.of(
                new Car("X5", 110_00),
                new Car("X3", 54_000),
                new Car("X7", 143_000),
                new Car("X6", 125_000)
        );

        Optional<Car> mostExpensiveCar = getMostExpensiveCar(tesla);
        mostExpensiveCar.ifPresent(System.out::println);

        Optional<Car> moreExpensiveCar = mostExpensiveCar
                .flatMap(car -> getMoreExpensiveCar(bmw, car));
        moreExpensiveCar.ifPresent(System.out::println);
    }

    public static Optional<Car> getMostExpensiveCar(Stream<Car> cars) {
        return cars.max(Comparator.comparingInt(Car::getPrice));
    }

    public static Optional<Car> getMoreExpensiveCar(Stream<Car> cars, Car mostExpensiveCar) {
        return cars.filter(car -> car.getPrice() > mostExpensiveCar.getPrice()).findFirst();
    }
}

class Car {
    private String name;
    private Integer price;

    public Car(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car: " + name + ", price: " + price + " USD";
    }
}