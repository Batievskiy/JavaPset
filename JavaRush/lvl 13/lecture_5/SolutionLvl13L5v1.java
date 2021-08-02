// JavaRush lvl 13 lecture 5 problem
// create method createNewPlanet()String
// - it has to add new planet after the Earth

import java.util.ArrayList;

public class SolutionLvl13L5v1 {
    public static ArrayList<String> planets = new ArrayList<>();

    public static void main(String[] args) {
        addPlanets();
        print();
        System.out.println("\n-----\n");

        createNewPlanet("Star of Death");
        print();
    }

    public static void createNewPlanet(String planetName) {
        planets.add(3, planetName);
    }

    public static void addPlanets() {
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");
    }

    public static void print() {
        int planetsSize = planets.size();
        for (int i = 0; i < planetsSize; i++) {
            String s = "th";
            if ((i + 1) == 1) {
                s = "st";
            } else if ((i + 1) == 2) {
                s = "nd";
            } else if ((i + 1) == 3) {
                s = "rd";
            } else {
                s = "th";
            }
            System.out.printf("%s = %d-%s planet from the Sun", planets.get(i), (i + 1), s);
            System.out.println();
        }
    }
}
