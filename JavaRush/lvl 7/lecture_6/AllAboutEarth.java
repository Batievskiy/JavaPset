// primitive problem from JavaRush
// make all values a constants using `final static`
public class AllAboutEarth {
    public static final String NAME = "Earth";
    public static final double SQUARE = 510_100_000;
    public static final long POPULATION = 7_594_000_000L;
    public static final long EQUATOR_LENGTH = 40_075_696;

    public static void main(String[] args) {
        System.out.println(NAME);
        System.out.println("Square: " + SQUARE);
        System.out.println("Population: " + POPULATION);
        System.out.println("Equator length: " + EQUATOR_LENGTH);
    }
}