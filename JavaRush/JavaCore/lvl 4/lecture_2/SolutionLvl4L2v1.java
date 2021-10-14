/*
 * 1. Correct the line 'Cat cat = new Cat();'
 * - to print out "Bingo!"
 *
 * - class Cat must implement the interface CanMove;
 * - class Cat parent of class Tiger;
 * - in variable cat must be stored an object,
 *   that instance of CanMove, Cat and TomCat;
 * - program must print "Bingo!"
 */

public class SolutionLvl4L2v1 {
    public static void main(String[] args) {
        Cat cat = new TomCat();

        boolean isCat = cat instanceof Cat;
        boolean isMovable = cat instanceof CanMove;
        boolean isTom = cat instanceof TomCat;

        if (isCat && isMovable && isTom) {
            System.out.println("Bingo!");
        } else {
            System.out.println("false");
        }
    }

    interface CanMove {

    }

    static class Cat implements CanMove {

    }

     static class TomCat extends Cat {

     }
}
