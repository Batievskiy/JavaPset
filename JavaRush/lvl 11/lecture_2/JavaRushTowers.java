/* JavaRush primitive problem
   lvl 11 lecture 2
   Create JavaRushTower - must contain:
   - three public Constructors
   - Default constructor
   - Constructor with a parameter type int
   - Constructor with a parameter type String
*/

public class JavaRushTowers {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

    public JavaRushTowers() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }
    public JavaRushTowers(int countFloors) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + countFloors);
    }
    public JavaRushTowers(String developer) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + developer);
    }

    public static void main(String[] args) {
        JavaRushTowers skyscraper = new JavaRushTowers();
        JavaRushTowers skyscraperTower = new JavaRushTowers(50);
        JavaRushTowers skyscraperSkyline = new JavaRushTowers("JavaRushDevelopment");
    }
}
