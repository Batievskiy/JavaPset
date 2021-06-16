// primitive JavaRush problem
// create method for generating random numbers from 0 to 99
// using Math.random()
public class Randomizerr {
    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    private static int generateNumber() {
        int rndNmbr;
        rndNmbr = (int)(Math.random() * 100);
        return rndNmbr;
    }
}
