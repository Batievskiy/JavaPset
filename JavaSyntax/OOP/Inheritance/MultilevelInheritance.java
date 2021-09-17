// what is Multilevel Inheritance in Java?
// let's find out
public class MultilevelInheritance {

    // In Multilevel Inheritance? a derived class will be inheriting a base class
    // and as well the derived class also act as the base class to other class.
    // Son Class is inherited from Father Class that inherited from Grandpa Class

    // Super Class for Father
    static class Grandpa {
        public void printGrandpa() {
            System.out.println("Im the Grandpa :) ");
        }
    }

    // subclass from Grandpa as well as Super Class for Son
    static class Father extends Grandpa {
        public void printFather() {
            System.out.println("I am son of Grandpa and father of Son");
        }
    }

    // Sub Class from Father
    static class Son extends Father {
        public void printSon() {
            System.out.println("I am a son of Father and grandson of Grandpa");
        }
    }

    public static void main(String[] args) {
        Son grandson = new Son();
        grandson.printSon();
        grandson.printFather();
        grandson.printGrandpa();
    }
}

