// small Problem from JavaRush
// compare cities and its population with biggest one
public class GiantCity {
    public static String city = "Tokyo";
    public static double population = 34.5;

    public static void main(String[] args) {
        printCityPopulation("Jakarta", 25.3);
        printCityPopulation("Seul", 25.2);
        printCityPopulation("Deli", 23.1);
        printCityPopulation("New York", 21.6);
    }

    // here we have to use Class.variable calling method because of shadowing
    public static void printCityPopulation(String city, double population) {
        System.out.println("population of " + city + "is " + population + "million");
        System.out.println("while in the most populous city " + GiantCity.city + " population is " + GiantCity.population + "million");
    }
}
