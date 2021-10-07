// create class EnglishTranslator that inherits Translator
// implement all abstract methods from it
// Figure out what to return in method getLanguage
// make that program to print out "I am an English-Hebrew translator"
// using the method translate from EnglishTranslator type

public class SolutionLvl3L4v0 {
    public static void main(String[] args) {
        EnglishTranslator englishTranslator = new EnglishTranslator();
        System.out.println(englishTranslator.translate());

    }

    public static abstract class Translator {
        public abstract String getLanguage();

        public String translate() {
            return "I am an : " + getLanguage() + " translator";
        }
    }

    public static class EnglishTranslator extends Translator {
        @Override
        public String getLanguage() {
            return "English-Hebrew";
        }
    }
}
