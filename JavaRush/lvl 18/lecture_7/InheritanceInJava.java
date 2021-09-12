public class InheritanceInJava {
    /* interfaces specify what a class must do and not how
     * it specifies a set of methods that the class has to implement
     * if a class implements an interface and does not provide method bodies
     * for all functions specified in the interface,
     * then the class must be declared abstract.

     * A Java library example is -> Comparator Interface
     * If a class implements this interface,
     * then it can be used to sort a collection
     */

    public static void main(String[] args) {
        Test test = new Test();
        test.display();
        System.out.println(Test.a);
    }
}

// multiple inheritance of interfaces:
interface Player {
    final int id = 10;

    int move();
}

interface InterfaceOne {
    // public, static and final
    final int a = 10;

    // public and abstract
    void display();
}

// A class that implements the interface
class Test implements InterfaceOne {
    // implements the capabilities of interface:
    public void display() {
        System.out.println("public void display()");
    }
}