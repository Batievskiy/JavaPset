public class InterfaceDefault {
    public static void main(String[] args) {
        Tomas tomas = new Tomas();
        tomas.voice();
        tomas.meow();

        // abstract interface cannot be instantiated
//        Cat cat = new Cat();


    }
}

interface Animal {
    default void voice() {
        System.out.println("animal's voice");
    }
}

// abstract interface cannot be instantiated
interface Cat extends Animal {
    void voice();
    void meow();
}

class Tomas implements Cat {

    // we have to implement voice method
    public void meow() {
        System.out.println("Meow");
    }
    public void voice() {
    }
}
