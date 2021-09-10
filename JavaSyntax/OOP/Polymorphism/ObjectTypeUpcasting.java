import java.util.List;
import java.util.ArrayList;

public class ObjectTypeUpcasting {

    public static void main(String[] args) {

        // regular class creation
        Animal animal = new Animal();
        Cat cat = new Cat();
        animal.eat();
        cat.eat();
        cat.meow();

        // Upcasting from Cat to Animal:
        Animal upcastedAnimal = new Cat(); // implicitly
        Animal catAnimal = cat;
        animal = (Animal) cat; // explicitly

        // Polymorphism
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        // we add cat and dog ant they are upcast to Animal type implicitly.
        // Cat and Dog is an Animal and they're polymorphic
        new AnimalFeeder().feed(animals);

        // (all Java objects are polymorphic because each object is an Object)
        Object object = new Animal();

        // upcasting to an interface is also common.
        Hiss hiss = new CatHiss();
        hiss.hiss();


    }
}

// parent class
class Animal {
    public void eat() {
        System.out.println("animal is eating");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Meow");
    }

    public void eat() {
        System.out.println("cat is eating");
    }
}

class CatHiss extends Animal implements Hiss {

    public void eat() {
        System.out.println("CatHiss is eating");
    }

    public void meow() {
        System.out.println("Meow");
    }

    public void hiss() {
        System.out.println("Hiss");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Woof-Woof");
    }
    public void eat() {
        System.out.println("dog is eating");
    }
}

class AnimalFeeder {
    public void feed(List<Animal> animals) {
        animals.forEach(animal -> {
            animal.eat();
        });
    }
}

interface Hiss {
    public void hiss();
}
