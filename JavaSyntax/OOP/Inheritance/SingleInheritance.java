// what is a Single Inheritance in Java?
// let's find out
public class SingleInheritance {

    // In Single Inheritance - subclasses inherit the features of one Super Class.
    // ClassOne serves as a base class for the derived class ClassTwo

    // Super Class
    static class ClassOne {
        public void printNerd() {
            System.out.print("Nerds ");
        }
    }

    // derived class from ClassOne
    static class ClassTwo extends ClassOne {
        public void printWeAre() {
            System.out.print("We are the ");
        }
        public void printInJava() {
            System.out.print("In Java :0");
        }
    }

    public static void main(String[] args) {
        ClassTwo nerd = new ClassTwo();
        nerd.printWeAre();
        nerd.printNerd();
        nerd.printInJava();
    }
}
