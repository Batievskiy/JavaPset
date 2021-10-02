public class JavaCoreAbstractClass {

}

abstract class Animal {
    // abstract methods - has to be overridden in all inherited classes.
    public abstract void voice();
    public abstract void eat();
}

class Cat extends Animal {
    // all the abstract methods of the parent class
    // have been overridden.
    @Override
    public void voice() {
        System.out.println("Meow.)");
    }
    @Override
    public void eat() {
        System.out.println("The Cat is eating.");
    }
}

class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Bark");
    }
    @Override
    public void eat() {
        System.out.println("The Dog is eating");
    }
}
