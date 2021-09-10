import java.util.List;

public class ObjectTypeDowncasting {
    public static void main(String[] args) {
        // Downcasting is used to invoke a method available only in superclass
        Animal animal = new Cat();

        // to call meow() we should downcast animal to Cat
        ((Cat) animal).meow();


    }
}

class Animal {
    public void eat() {
        System.out.println("cat is eating");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Meow");
    }

    // here we can use exact method of super class
    @Override
    public void eat() {
        super.eat();
    }
}

class AnimalFeeder {
    public void feed(List<Animal> animals) {
        animals.forEach(animal -> {
            animal.eat();

            // we often use instanceof operator before downcasting
            // to check if the object belongs to the specific type.
            // ClassCastException - if not do that
            if (animal instanceof Cat) {
                ((Cat) animal).meow();
            }
            // or do another way
            if (Cat.class.isInstance(animal)) { // but it's REDUNDANT
                Cat cat = Cat.class.cast(animal); // same here
                cat.meow();
            }
        });
    }
}
