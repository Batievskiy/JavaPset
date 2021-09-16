public class InterfaceInheritanceDuck {
    public static void main(String[] args) {
        UnsureBird unsureBird = new UnsureBird();
        Duck duck = new Duck();

        unsureBird.fly();
        unsureBird.swim();

        duck.fly();
        duck.swim();
    }
}

interface FlyingBird {
    default void fly() {
        System.out.println("I believe I can FLY...");
    }
}

interface Waterfowl {
    default void swim() {
        System.out.println("I believe I can SWIM...");
    }
}

class UnsureBird implements FlyingBird, Waterfowl {
    // using default methods of two implemented interfaces
}

class Duck implements FlyingBird, Waterfowl {
    @Override
    public void fly() {
        System.out.println("I'm the Duck - I can fly!");
    }

    @Override
    public void swim() {
        System.out.println("I'm the Duck - I can swim!");
    }
}