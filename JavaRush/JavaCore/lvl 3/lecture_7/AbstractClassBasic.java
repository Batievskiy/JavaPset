public class AbstractClassBasic {
    public static void main(String[] args) {
        // 1) Like C++, in Java, an instance of an abstract class
        // cannot be created, we can have references
        // to abstract class type though.

        // uncomment to see an error
        // Base base = new Base();

        // But we can have reference of Base type
        Base b = new Derived();


        // 2) Like C++, an abstract class can contain constructors in Java.
        // And a constructor of abstract class is called
        // when an instance of an inherited class is created.
        Derived derived = new Derived();
        derived.fun();

        // 3) In Java, we can have an abstract class without any abstract method.
        // This allows us to create classes that cannot be instantiated
        // but can only be inherited.
        DerivedFromBaseZeroMethods dfbzm = new DerivedFromBaseZeroMethods();
        dfbzm.fun();

        // 4) Abstract classes can also have final methods
        // (methods that cannot be overridden).
        derived.finalVoid();

        // 5) For any abstract java class we are not allowed
        // to create an object i.e., for abstract class instantiation
        // is not possible.
        // Base bAse = new Base();

        // 6) Similar to the interface we can define static methods
        // in an abstract class that can be called independently
        // without an object.
        DerivedFromWithStaticMethod derivedFromWithStaticMethod =
                new DerivedFromWithStaticMethod();
    }
}

// 2) Like C++, an abstract class can contain constructors in Java.
// And a constructor of abstract class is called
// when an instance of an inherited class is created.
abstract class Base {
    Base() {
        System.out.println("Base class constructor called");
    }

    abstract void fun();

    // 4) Abstract classes can also have final methods
    // (methods that cannot be overridden).
    final void finalVoid() {
        System.out.println("Base class finalVoid() method called");
    }
}

class Derived extends Base {
    Derived() {
        System.out.println("Derived class constructor called");
    }

    void fun() {
        System.out.println("Derived fun() method called");
    }
}

// 3) In Java, we can have an abstract class without any abstract method.
// This allows us to create classes that cannot be instantiated
// but can only be inherited.
abstract class BaseZeroMethods {
    void fun() {
        System.out.println("BaseZeroMethods fun() method called");
    }
}

class DerivedFromBaseZeroMethods extends BaseZeroMethods {

}

// 6) Similar to the interface we can define static methods
// in an abstract class that can be called independently
// without an object.
abstract class WithStaticMethod {
    static void doParty() {
        System.out.println("WithStaticMethod doParty() method called");
    }
}

class DerivedFromWithStaticMethod extends WithStaticMethod {

}
