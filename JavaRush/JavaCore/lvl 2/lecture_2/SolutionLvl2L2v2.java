// override the method getChild in class Cat and Dog
// - make the Cat give birth to a Cat
// - make the Dog give birth to a Dog

public class SolutionLvl2L2v2 {
    public static void main(String[] args) {
        Pet pet1 = new Cat();
        Pet cat = pet1.getChild();

        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();

    }

    public static class Pet {
        public Pet getChild() {
            return new Pet();
        }
    }

    public static class Cat extends Pet {
        @Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {
        @Override
        public Pet getChild() {
            return new Dog();
        }
    }
}
