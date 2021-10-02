public class SolutionLvl2L6v4 {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {

        public String getName() {
            return "Cat";
        }

        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {

        public String getName() {
            return "Dog";
        }

        public Pet getChild() {
            return new Dog();
        }
    }
}