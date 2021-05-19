
// what is Public access modifiesr?
// this is detailed explanation fof dummies in programming like me.)
public class PrivateAccessModifier {
    /* The scope of private modifiers is limited to the class only
    * Private Data members and methods are only accessible within the class
    * Class and Interface cannot be declared as private
    * If a class has private constructor then you cannot create
    * the object of that class from outside of the class
     */
    // for example below:
}

class XYZ {
    private double number = 444;
    private int square(int a) {
        return a * a;
    }
}
// this give an error because we are tying to access the private data member
// and private method of class XYZ
public class Example {
    public static void main(String[] args) {
        XYZ object = new XYZ();
        System.out.println(object.number);
        System.out.println(object.square(10));
    }
}
