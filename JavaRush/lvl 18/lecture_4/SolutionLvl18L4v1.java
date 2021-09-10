// create runWorkingProcess() method with duty between all crew members
// assign responsibilities:
// Humans - pilot a spaceship
// Dog - navigate a flight
// Cat - research the Space

// pilot(Human human)
// createDirection(Dog dog)
// research(Cat cat)

import java.util.ArrayList;

public class SolutionLvl18L4v1 {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
        runWorkingProcess();
    }

    public static void runWorkingProcess() {
        Human human1 = (Human) astronauts.get(0);
        Human human2 = (Human) astronauts.get(1);
        pilot(human1);
        pilot(human2);

        Dog dog = (Dog) astronauts.get(2);
        createDirection(dog);

        Cat cat = (Cat) astronauts.get(3);
        research(cat);
    }

    public static void pilot(Human human) {
        System.out.println("Crew member " +
                human.getInfo() +
                " piloting the SpaceShip");
    }

    public static void createDirection(Dog dog) {
        System.out.println("Crew member " +
                dog.getInfo() +
                " is creating a rout");
    }

    public static void research(Cat cat) {
        System.out.println("Crew member " +
                cat.getInfo() +
                " researching the Space");
    }

    public static void createCrew() {
        astronauts.add(new Human());
        astronauts.add(new Human());
        astronauts.add(new Dog());
        astronauts.add(new Cat());
    }

    public static void printCrewInfo() {
        System.out.println("All on board:");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}

class Astronaut {
    public String getInfo() {
        return "Unknown Astronaut";
    }
}

class Human extends Astronaut {
    public String getInfo() {
        return "Human";
    }
}

class Cat extends Astronaut {
    public String getInfo() {
        return "Cat";
    }
}

class Dog extends Astronaut {
    public String getInfo() {
        return "Dog";
    }
}