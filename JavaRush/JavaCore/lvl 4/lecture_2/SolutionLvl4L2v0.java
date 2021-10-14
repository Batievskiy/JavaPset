/*
 * 1. Correct the line 'Object animal = new Pet();'
 * - to print "Bingo!"
 *
 * - class Cat must be inherited from class Pet;
 * - class Tiger must be inherited from class Cat;
 * - in variable Object animal must be stored an object,
 *   that is instance of Pet, Cat and Tiger;
 * - program must print out "Bingo!"
 */

public class SolutionLvl4L2v0 {
    public static void main(String[] args) {
        Object animal = new Tiger();
        boolean isCat = animal instanceof Cat;
        boolean isTiger = animal instanceof Tiger;
        boolean isPet = animal instanceof Pet;

        printResults(isCat, isTiger, isPet);
    }

    private static void printResults(boolean cat, boolean tiger, boolean pet) {
        if (cat && tiger && pet) {
            System.out.println("Bingo!");
        } else System.out.println("false");
    }

    static class Pet {

    }

    static class Cat extends Pet {

    }

    static class Tiger extends Cat {

    }
}
