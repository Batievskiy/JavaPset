// run the program and look what will happen.
// in the method eat() - add block final to force Lion to sleep.



public class SolutionLvl15L3v1 {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat(new Food("meat"));
        lion.eat(null);
    }
}

class Food {
    String name;

    public Food(String name) {
        this.name = name;
    }
}

class Lion {
    public void eat(Food food) {
        try {
            System.out.println();
            System.out.println("Searching for a food...");
            System.out.println("Found the food... " + food.name);
            System.out.println("Ate all the food!");
        } catch (NullPointerException e) {
            System.out.println("Didn't found any food");
        } finally {
            System.out.println("The lion went to bed hungry :(");
        }
    }
}