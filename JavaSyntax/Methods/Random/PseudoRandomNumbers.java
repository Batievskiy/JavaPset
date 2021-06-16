// what is Pseudorandom Numbers in Java?
// lets find out
public class PseudoRandomNumbers {
    static int a = 41;
    static int c = 11119;
    static int m = 11113;
    static int seed = 1;

    // there is no actual random numbers, but...
    static int getNextRandom() {
        seed = (a * seed + c) % m;
        return seed;
    }

    public static void main(String[] args) {
        System.out.println("---< Pseudo Random >---");
        System.out.println("47? Yep: " + getNextRandom());
        System.out.println("not random");
        System.out.println("47? Nope: " + getNextRandom());
        System.out.println("random, but how?\n");
        System.out.println("next three random? yes: ");
        // it's a Kind of Magic :)
        for (int i = 0; i < 3; i++) {
            System.out.println("---> " + getNextRandom());
        }
        System.out.println("\nit's a Kind of Magic :)");
        System.out.println(); // new line

        // let's use Math.random() - returns pseudo random number from 0.0 to 0.999...9
        System.out.println("---< Math.random() >---");
        for (int i = 0; i < 3; i++) {
            System.out.println("---> " + (Math.random() * 10)); // multiply by 10 for 0 to 99 results
        }

        // roll a dice
        System.out.println("\nroll a dice of 6: ---> " + getRandomDiceNumber());
    }

    // let's write method to get random Dice 6 number
    static int getRandomDiceNumber() {
        return (int) ((Math.random() * 6) + 1); // give us 0....5 and + 1, so from 1 to 6
    }
}
