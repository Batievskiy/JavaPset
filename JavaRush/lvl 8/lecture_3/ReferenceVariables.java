// what is a reference variables?
// let's find out
public class ReferenceVariables {

    /* when we create an object (instance) of class then space is reserved in heap memory
     * reference variable is used to point object / value
     * Classes, interfaces, arrays, enumerations and annotations are reference types in Java
     * Reference variables hold the object / value of reference types in Java
     * Reference variables can also store null value (null - by default if no objects to a reference variable)
     * we can access object members using a reference variable using dot syntax.
     */

    public static void main(String[] args) {

        // we creating instance in heap memory
        Demo D1 = new Demo(); // this is a reference of the object D1

        System.out.println(D1); // print out an address

        System.out.println(D1.x); // accessing instance(object) variable

        System.out.println(D1.display()); // print out a value

        D1.display(); // accessing instance method

        // creating another instance if an object
        Demo M1 = new Demo();

        // pointing to same reference
        Demo Q1 = M1; // just copy of addresses

        // updating the value of `x` using Q1
        Q1.x = 25; // literally - going by address stored in Q1 -> to .x and store 25 to x

        System.out.println(M1.x);
    }
}

class Demo {
    int x = 10;
    int display()
    {
        System.out.println("x = " + x);
        return 0;
    }
}
