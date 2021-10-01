// override the method getName in class Whale()
// to print "I'm not a Cow, I am the Whale"

public class SolutionLvl2L2v0 {
    public static void main(String[] args) {
        Cow cow = new Whale();
        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "I am Cow";
        }
    }

    public static class Whale extends Cow {
        @Override
        public String getName() {
            return "I'm not a Cow, I am the Whale";
        }
    }
}
