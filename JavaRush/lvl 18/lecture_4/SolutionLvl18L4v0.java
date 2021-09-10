// create a crew:
// two People, one Dog, one Cat
// inherit them all from Astronaut class
// use method createCrew() in a list of astronauts

import java.util.ArrayList;

public class SolutionLvl18L4v0 {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void createCrew() {
        astronauts.add(new Human());
        astronauts.add(new Human());
        astronauts.add(new Cat());
        astronauts.add(new Dog());
    }

    public static void printCrew() {
        System.out.println("All on board: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }

    public static void main(String[] args) {
        createCrew();
        printCrew();
    }
}

class Dog extends Astronaut {
    public String getInfo() {
        return "Dog";
    }
}

class Cat extends Astronaut {
    public String getInfo() {
        return "Cat";
    }
}

class Human extends Astronaut {
    public String getInfo() {
        return "Human";
    }
}

class Astronaut {
    public String getInfo() {
        return "Unknown astronaut";
    }
}