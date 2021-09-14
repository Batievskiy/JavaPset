public class PolymorphismAnimalz {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Lion lion = new Lion();
        Tiger tiger = new Tiger();

        Doctor doctor = new Doctor();

        // all three classes can be passed as arguments
        // because all of them are inherited from an animal

        doctor.healAnimal(cat); // cat inherited from animal and can be healed
        doctor.healAnimal(lion); // lion and tiger inherited from cat and also can be healed
        doctor.healAnimal(tiger);
    }
}

class Animal {
    public void printName() {
        System.out.println("I'm an animal");
    }
}

class Cat extends Animal {
    @Override
    public void printName() {
        System.out.println("I'm Cat");
    }
}

class Lion extends Cat {
    @Override
    public void printName() {
        System.out.println("I'm Lion");
    }
}

class Tiger extends Cat {
    @Override
    public void printName() {
        System.out.println("I'm Tiger");
    }
}

class Doctor {
    public void healAnimal(Animal animal) {
        System.out.print("Animal is healed: ");
        animal.printName();
    }
}