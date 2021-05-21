/* what is Instance Variables?
 * are non static variables and are declared in a class outside any method, construct or block
 * instance variables are declared in a class, these variables are created
 * when an object of the class is created and destroyed when the object is destroyed
 * we may use access specifiers for instance variables
 * If we do not use specify any access specifier then default access specifier will be used
 * Initialization of Instance variables is mandatory (default value is 0)
 * Instance variables can be accessed only by creating objects
*/
class Cars {
    /* these variables are instance variables
     * they are in a class
     * and are not inside any function
     */
    String brand;
    String model;
    int year;
}

public class InstanceVariables {
    public static void main(String[] args) {

        // first object
        Cars car1 = new Cars();
        car1.brand = "Ford";
        car1.model = "Focus";
        car1.year = 2021;

        // second object
        Cars car2 = new Cars();
        car2.brand = "Dodge";
        car2.model = "Viper";
        car2.year = 1977;

        // printing info about first car
        System.out.println("first car: ");
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);

        // printing info about second car
        System.out.println("second car: ");
        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
    }
}
