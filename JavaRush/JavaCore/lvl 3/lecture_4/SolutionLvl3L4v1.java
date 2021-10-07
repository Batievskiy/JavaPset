// correct the code
// - to print out "I am English translator"
// don't change main method

public class SolutionLvl3L4v1 {
    public static void main(String[] args) {
        Translator translator = new Translator();
        System.out.println(translator.translate());
    }

    public /* abstract */ static class Translator {
        public String translate() {
            return "I am English translator";
        }
    }
}
