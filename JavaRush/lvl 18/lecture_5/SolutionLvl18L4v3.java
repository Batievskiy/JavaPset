// you have four classes of animals:
// Cow, Lion, Wolf and Elephant
// Cow and Elephant are herbivore - inherit them from Herbivore
// Lion and Wolf are predatory animal - inherit them from Predator
// create printRation(Animal animal) method:
// if Herbivore - "loves herbs"
// if Predator - "loves meat"
public class SolutionLvl18L4v3 {
    public static void main(String[] args) {

    }

    public static void printRation(Animal animal) {
        String herbivore = "loves herbs";
        String predator = "loves meat";

        if (animal instanceof Herbivore) {
            System.out.println(herbivore);
        } else {
            System.out.println(predator);
        }
    }
}

class Animal {

}

class Herbivore extends Animal {

}

class Cow extends Herbivore {

}

class Elephant extends Herbivore {

}

class Predator extends Animal {

}

class Wolf extends Predator {

}

class Lion extends Predator {

}