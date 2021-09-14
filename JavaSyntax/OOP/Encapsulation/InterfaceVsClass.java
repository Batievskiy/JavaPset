public class InterfaceVsClass {
    public static void main(String[] args) {
        Mockingjay mockingjay = new Mockingjay();
        mockingjay.setSpecies("Mockingjay");
        mockingjay.setAge(13);
        System.out.println("species -> " + mockingjay.getSpecies());
        System.out.println("age -> " + mockingjay.getAge());
        mockingjay.fly();

    }
}

// interface can't store private variables
// because interface has been created to be used by User.
// Interface only describes behaviour!
// Interface has no state.
// Interface can be implemented by any class.
interface Flyable {
    String species = new String();
    int age = 10;

    public void fly();
}

// Abstract class has state.
// it describes both - behaviour and state
// Abstract class tightens and joins classes together
// (those which has something in common).
// Classes can implement any number of interfaces
// but be inherited from one only
abstract class Bird {
    private String species;
    private int age;

    public abstract void fly();

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Mockingjay extends Bird {
    @Override
    public void fly() {
        System.out.println("Fly, Mockingjay");
    }
}