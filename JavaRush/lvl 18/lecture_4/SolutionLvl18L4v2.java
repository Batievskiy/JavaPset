// traverse through all astronauts in runWorkingProcess()
// and check all of them using instanceof operator

import java.util.ArrayList;

public class SolutionLvl18L4v2 {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
        runWorkingProcess();
    }

    public static void runWorkingProcess() {
        for (Astronaut astronaut : astronauts) {
            if (astronaut instanceof Human) {
                pilot((Human) astronaut);
            } else if (astronaut instanceof Dog) {
                createDirection((Dog) astronaut);
            } else {
                research((Cat) astronaut);
            }
        }
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