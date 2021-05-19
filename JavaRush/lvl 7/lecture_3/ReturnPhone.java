
// this is detailed explanation for Dummies in programing like me.)
// something about return values
public class ReturnPhone {
    public static void main(String[] args) {

        /*
        * The return keyword is used to return from a method
        * when its execution is complete.
        * When a return statement is reached in a method,
        * the program returns to the code that invoked it.

        * A method can return a value or reference type
        * or does not return a value.
        * If a method does not return a value, the method
        * must be declared void and it doesn’t need to contain
        * a return statement.

        * If a method declare to return a value, then
        * it must use the return statement within the body of method.
        * The data type of the return value must match the method’s
        * declared return type.
         */

        int sum = ReturnPhone.addXYZ(1, 2, 3);
        System.out.println("sum = " + sum);

        Phone phone = new Phone("Apple", "iPhone 12");
        System.out.println(phone.getPhone());

        printSome(); // void function doesn't return anything

        System.out.println(getString()); // String return string type
    }

    // this method returns calculated value
    public static int addXYZ(int x, int y, int z) {
        // return an int type value
        return x + y + z;
    }

    // this method returns nothing, but print out string
    public static void printSome() {
        System.out.println("void method does not void anything!");
        // it does'not have to contain return statement, but it may.)
        return;
    }

    //
    public static String getString() {
        return "return String type";

        // if try to execute a statement after return
        // a value will cause compile-time error
        // String error = "error";
    }
}

class Phone {
    private String brand;
    private String model;

    Phone(String tpe, String nme) {
        this.brand = tpe;
        this.model = nme;
    }

    public Phone getPhone() {
        // return Phone type
        return this;
    }

    // this method returns string with brand and model values
    public String toString() {
        return "brand: " + brand.concat("\nmodel: " + model);
    }
}
