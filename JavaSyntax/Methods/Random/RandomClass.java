// what is Random Class?
// let's find out

import java.util.Random;

public class RandomClass {

    // Random class is used to generate pseudo-random numbers in Java.
    // An instance of this class is thread-safe.
    // There instance of this class is however cryptographically insecure.
    // Provides various method calls to generate different
    // random data types such as float, double, int.

    static final Random rnd = new Random();

    public static void main(String[] args) {

        System.out.println("---< Class Random() >---");
        // random integer in bounds from 0 to 10(excluded)
        System.out.println("random int (0 to 9): "
                + rnd.nextInt(10));

        // random  double
        System.out.println("random double: "
                + rnd.nextDouble());

        // random float
        System.out.println("random float: "
                + rnd.nextFloat());

        // random long
        System.out.println("random long: "
                + rnd.nextLong());

        // random boolean
        System.out.println("random boolean: "
                + rnd.nextBoolean());

        // random gaussian
        System.out.println("random Gaussian: " + rnd.nextGaussian());
    }
}
