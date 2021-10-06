// override method getName in class Cat
// - to print out "I am The Cat"

public class SolutionLvl2L12v0 {
    public static void main(String[] args) {
        Pet pet = new Cat();

        System.out.println(pet.getName());
    }

    public static class Pet {
        public String getName() {
            return "i'm cat";
        }
    }

    public static class Cat extends Pet {
        @Override
        public String getName() {
            return "I am The Cat";
        }
    }
}


