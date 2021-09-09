public class PolymorphismInJava {
    public static void main(String[] args) {
        Whale whale = new Whale();
        whale.printAll();

        // auto cast Whale on Cow object
        Cow cow = new Whale();
        cow.printName();

        // auto cast Whale object on base Object
        Object o = new Whale();
        System.out.println(o.toString());
    }
}

class Cow {
    public void printAll() {
        printColor();
        printName();
    }

    public void printColor() {
        System.out.println("I'm WHITE");
    }

    public void printName() {
        System.out.println("My name is COW");
    }
}

class Whale extends Cow {
    @Override
    public void printName() {
        System.out.println("My name is WHALE");
    }
}
