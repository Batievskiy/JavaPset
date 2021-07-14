// what is Wrapper Classes in Java?
// let's find out
public class WrapperClasses {
    /* A Wrapper class is a class whose object wraps
    // or contains primitive data types

    Need of Wrapper Classes:
    1. Convert primitive data types into objects.
    - Objects are needed if we wish to modify the arguments,
    passed into a method (because primitive types are passed by value)
    2. Data structures in the Collection framework,
    - such as ArrayList and Vector,
    - store only objects (reference types) and not primitive types;
    3. An object is needed to support synchronization in multithreading.

    Primitive.......Wrapper Class
    char            Character
    byte            Byte
    short           Short
    int             Integer
    long            Long
    float           Float
    double          Double
    boolean         Boolean

     */

    public static void main(String[] args) {

        // to convert a Class into a primitive...
        // ...we can use -> so called "Boxing / Unboxing"

        // boxing int(33) -> going to-> wrapper Integer
        Integer ageInteger = Integer.valueOf(33);
        // unboxing int from Integer
        int ageInt = ageInteger.intValue();


        Integer a = Integer.valueOf(5); // wraps int 5 into an Integer
        int b = a.intValue(); // unwraps int from Integer
        Integer c = new Integer(b + 5); // Create new Integer

        // But! This is automatic process in Java...
        // ...called -> Autoboxing / Unboxing:
        // - auto-conversion of primitive type
        // to the object of their corresponding wrapper classes.
        Integer aA = 10; // automatic wrap
        int bB = aA;
        Integer cC = aA + bB;
    }
}
