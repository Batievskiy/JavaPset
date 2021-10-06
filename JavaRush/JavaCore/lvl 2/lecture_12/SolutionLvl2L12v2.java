// add one method into class Cat
// - not to print anything

public class SolutionLvl2L12v2 {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("i'm cat");

        System.out.println(pet.getName());

    }

    public static class Pet {
        protected String name;

        public Pet() {

        }

        public final String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Cat extends Pet {
        @Override
        public static String getName() {
            return super.name;
        }
    }
}
