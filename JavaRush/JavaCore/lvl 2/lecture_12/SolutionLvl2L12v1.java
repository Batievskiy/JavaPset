// override the method setName in class Cat
// - to print out "I am The Cat"

public class SolutionLvl2L12v1 {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("I'm cat");

        System.out.println(pet.getName());
    }

    public static class Pet {
        protected String name;

        public Pet() {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Cat extends Pet {
        @Override
        public void setName(String name) {
            this.name = "I am The Cat";
        }
    }
}
