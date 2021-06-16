import java.util.Random;

// primitive usage of Random() class
// create a dice of six randomizer
public class DiceSixRandom {
    public static void main(String[] args) {
        Random diceSix = new Random();
        int number =  diceSix.nextInt(6) + 1;
        System.out.println("dice throws -> " + number);
    }
}
