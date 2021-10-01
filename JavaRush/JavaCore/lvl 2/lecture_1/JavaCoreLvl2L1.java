public class JavaCoreLvl2L1 {
    public static void main(String[] args) {
        /*
        Remember:
        Casting does not change the actual object type.
        Only the reference type gets changed.
        Upcasting is always safe and never fails.
        Downcasting can risk throwing a ClassCastException,
        so the instanceof operator is used to check type before casting.
         */

        Animal animal = new Animal();
        animal.printName();
        animal.printName();
        animal.voice();

        Cat cat = new Cat();
        cat.printName();
        cat.printColor();
        cat.meow();

        Animal animalCat = new Cat(); // Upcasting Whale to Cow class
        animalCat.printName();
        animalCat.printColor();
        animalCat.voice();

        Object o = new Cat();
        System.out.println(o.toString()); // Upcasting Whale to Object class

        Animal anim = new Cat();
        if (anim instanceof Cat) {
            Cat catAcat = (Cat) anim; // Downcasting Animal to Cat class
            catAcat.meow();
        } else if (anim instanceof Dog) {
            Dog dogAdog = (Dog) anim; // Downcasting Animal to Cat class
            dogAdog.bark();
        }
    }
}

class Animal {
    public void printName() {
        System.out.println("I am an Animal.");
    }

    public void printColor() {
        System.out.println("I am White Animal.");
    }

    public void voice() {
        System.out.println("Amni-nom-nom-al");
    }
}

class Cat extends Animal {
    @Override
    public void printName() {
        System.out.println("I am Cat.");
        super.printName(); // calling method of parent class Animal
    }
    public void meow() {
        System.out.println("Meow.");
    }
}

class Dog extends Animal {
    @Override
    public void printName() {
        System.out.println("I am Cat.");
    }
    public void bark() {
        System.out.println("Bark.");
    }
}

