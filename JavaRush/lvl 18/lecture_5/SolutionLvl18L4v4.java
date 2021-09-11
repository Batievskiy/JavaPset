// class Pet is a parent class for Cat and Dog
// printInfo() - gives info about classes
// Override method printInfo() for Cat and Dog separately
// for Cat - "I'm a Pet", "I don't like the humans"
// for Dog - "I'm a Pet", "I like the humans"

public class SolutionLvl18L4v4 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.printInfo();
        dog.printInfo();
    }
}

class Pet {
    public void printInfo() {
        System.out.println("I'm a Pet");
    }
}

 class Cat extends Pet {
    public static final String CAT = "I don't like the humans";

    @Override
     public void printInfo() {
        System.out.println("I'm a Pet");
        System.out.println("I don't like the humans because I am Cat :O");
    }
 }

 class Dog extends Pet {
    public static final String DOG = "I love the humans because I am Dog ;?";

    @Override
     public void printInfo() {
        System.out.println("I'm a Pet");
        System.out.println(DOG);
    }
 }