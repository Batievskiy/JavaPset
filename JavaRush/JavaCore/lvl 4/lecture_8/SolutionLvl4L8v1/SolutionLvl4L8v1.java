/*
 * 1. Create an abstract class Drink
 * - implement public void taste() - to print "Tasty"
 * 2. Create class Wine extends Drink
 * - implement public String getHolidayName() - to print "Birthday"
 * 3. Create class SparklingWine extends Wine
 * - implements String getHolidayName() - to print "New Year"
 * 4. Implement methods (in Solution class):
 * - getDeliciousDrink()
 * - getWine()
 * - getSparklingWine()
 */

public class SolutionLvl4L8v1 {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getSparklingWine().getHolidayName());
        System.out.println(getWine().getHolidayName());

    }

    public static Drink getDeliciousDrink() {
        return new Wine();
    }

    public static Wine getWine() {
        return new Wine();
    }

    public static SparklingWine getSparklingWine() {
        return new SparklingWine();
    }
}
