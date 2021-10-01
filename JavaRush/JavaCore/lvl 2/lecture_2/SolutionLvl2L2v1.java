// override the method getName() in the class Whale
// to return an empty string

public class SolutionLvl2L2v1 {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());

    }

    public static class Cow {
        public String getName() {
            return "I am the Cow";
        }
    }

    public static class Whale extends Cow {
        @Override
        public String getName() {
            return "";
        }
    }
}
