
// let's figure out how to use return in methods
// this is explanation for Dummies in programming like me.)
public class ReturnWhat {
    public static void main(String[] args) {
        /*
       in a return statement, we evaluate expressions:
       * and as a part of this evaluation, other methods may run.
       * types must match, or an errors occurs
       * code after a return may become unreachable
         */

        // return expressions
        // for example calculate area of rectangle
        int result = calculateArea(10, 3);
        System.out.println(result);

        // return method result
        // let's calculate volume
        int volume = getVolume(2);
        System.out.println(volume);

        // return, in a void method
        toScreenPswd("coca-cola");
        toScreenPswd("bang!");

        // boolean return value
        System.out.println(isValid("sakura", true)); // name "sakura" is long enough and does exist
        System.out.println(isValid("sam", true)); // name "sam" isn't long enough but does exist
        System.out.println(isValid("longname", false)); // name "longname" is long enough but doesn't exist

        // compilation errors
        result = getResult("cat"); // "cat" is too short for method works
        System.out.println(result);
    }


    // this simple function will calculate Area of rectangle
    static int calculateArea(int height, int width) {
        // return an expression (used two variables)
        return height * width;
    }

    // this simple function will calculate volume of cube
    public static int cube(int side) {
        // simple return side in power of 3 when getVolume returns
        return (int) Math.pow(side, 3); // returns the result of Math.pow
    }
    // and this one is return cubed number
    public static int getVolume(int size) {
        return cube(size);
    }

    // an implicit/hidden return is at the end of the method
    // specify a return statement with no arguments to have an early exit
    public static void toScreenPswd(String password) {
        // type a password to the console
        System.out.println("password: " + password);
        // return if the password is longer than 7
        if (password.length() >= 7) {
            return;
        }
        System.out.println("password is not long enough!");
        // the implicit return is here (its hidden)
    }

    // this boolean returns true if name does exist and its length is OK
    public static boolean isValid(String name, boolean exists) {
        // return a boolean value based on the name length
        // and this name exist or not exist
        return name.length() >= 3 && exists;
    }

    // this method does not compile without return value.)
    public static int getResult(String name) {
        if (name.length() <= 4) {
            System.out.println("too short");
        }
        return 1; // an error
    }
}
