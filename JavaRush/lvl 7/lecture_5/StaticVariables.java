/* what is Static Variables?
 * are also known as Class variables
 * are declared in a Class but using the `static` keyword
 * withing a class outside any method constructor or block
 * We can have only one copy of static variable per class
 * Static variables are created at the start of program execution
 * and destroyed automatically when execution ends
 * Initialization is mandatory (default value is 0)
 * we have to access to static variable through ClassName.variable
*/

class Health {
    // static variable good
    public static double good;
    public static String howIs = "very";
}

public class StaticVariables {
    public static void main(String[] args) {
        // access to static variable without object
        Health.good = 1001;
        System.out.println(Health.howIs + "%" + Health.good);

        // access to static methods
        add(44);
        remove(11);
        System.out.println(Storage.sum);
    }



    public static class Storage {
        public static int sum = 0; // this is `class` variable and its available in terms of this class
        public static int count = 0; // same variable is here    }
    }

    // static methods can use static variables only!

    public static void add(int data) { // `data` variable is available only in this method
        Storage.sum = Storage.sum + data;
        Storage.count++;
    }

    public static void remove(int data) {
        Storage.sum = Storage.sum - data;
        Storage.count--;
    }
}
