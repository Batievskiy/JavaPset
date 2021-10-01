// write the method
// - that defines what type of the Object is
// and print that info.

public class SolutionLvl2L2v3 {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new What());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        if (o instanceof Cat) {
            System.out.println("it's a Cat");
        } else if (o instanceof Dog) {
            System.out.println("it's a Dog");
        } else if (o instanceof Lamp) {
            System.out.println("it's a Lamp");
        } else if (o instanceof Bird) {
            System.out.println("it's a Bird");
        } else {
            System.out.println("UNKNOWN");
        }
    }

    public static class Cat {

    }
    public static class Dog {

    }
    public  static  class Bird {

    }
    public static class Lamp {

    }
    public static class What {

    }
}
