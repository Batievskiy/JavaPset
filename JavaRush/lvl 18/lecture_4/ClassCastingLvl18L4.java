public class ClassCastingLvl18L4 {
    public static void main(String[] args) {

        Fish fish = new Whale(); // downcasting
        fish.printAll();

        fish.sound();
        // good practice is to check if one class is instanceof another
        // before using its methods
        if (fish instanceof Whale) {
            Whale whale = (Whale) fish;
            fish.sound();
        }
        fish = new Fish(); // upcasting
        fish.printName();

        BigFish bigFish = new BigFish();
        bigFish.sound();
    }
}

class Fish {
    public void sound() {
        System.out.println("fish can't sound");
    }
    public void printName() {
        System.out.println("I'm Fish");
    }
    public void printColor() {
        System.out.println("I don't have color");
    }
    public void printAll() {
        printName();
        printColor();
    }
}

class Whale extends Fish {
    public void sound() {
        System.out.println("Pfffff!");
    }
    public void printName() {
        System.out.println("I'm Whale");
    }
    public void printColor() {
        System.out.println("I'm white whale");
    }
}

// we also can call super class method using word super
class BigFish extends Fish {
    @Override
    public void sound() {
        super.sound();
    }
    public void printName() {
        System.out.println("I'm BigFish");
    }
    public void printColor() {
        System.out.println("I'm black BigFish");
    }
}