// Add an interface Drink to class AlcoholBeer
// and create it

public class SolutionLvl3L2v1 {
    public static void main(String[] args) {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());

    }


    public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Drink {
        @Override
        public boolean isAlcoholic() {
            return true;
        }

        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "Drink is Alcoholic";
            } else {
                return "Drink is Non-Alcoholic";
            }
        }
    }
}
