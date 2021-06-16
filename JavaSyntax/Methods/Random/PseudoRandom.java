import java.util.Random;

// pseudo random numbers in Random() class proof
public class PseudoRandom {
    public static void main(String[] args) {

        // class Random with same seeds is generating equal sequences of numbers
        Random rnd1 = new Random(1L);
        Random rnd2 = new Random(1L);
        boolean isEqual = rnd1.nextInt(6) == rnd2.nextInt(6);
        System.out.println(rnd1.nextInt(6));
        System.out.println(rnd2.nextInt(6));
        System.out.println("is equal? ---> " + isEqual);
        // Equal because seed of both is the same
    }
}
