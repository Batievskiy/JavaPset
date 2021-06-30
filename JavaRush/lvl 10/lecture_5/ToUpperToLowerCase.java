import java.util.Locale;

// what is .toUpperCase() .toLowerCase() methods in Java?
// let's find out
public class ToUpperToLowerCase {
    public static void main(String[] args) {
        System.out.println("---< .toUpperCase() .toLowerCase() methods in Java >---");

        // There are two variant of toUpperCase() method.

        // 1. .toUpperCase() - converts all characters of the string into a uppercase letter
        System.out.println("1. .toUpperCase() - converts all characters of the string into a uppercase letter ->");
        String s1 = new String("hello java world");
        System.out.println("original string s1 -> " + s1);
        System.out.println("to upper case -> " + s1.toUpperCase());
        System.out.println();

        // 2. .toUpperCase(Locale locale) -
        String s2 = new String("ionics bionics micronix");
        System.out.println("s2 -> " + s2);
        // Locales with the language "tr" for TURKISH
        // "en" for ENGLISH creation
        Locale TURKISH = Locale.forLanguageTag("tr");
        Locale ENGLISH = Locale.forLanguageTag("en");

        // converting string s1 to uppercase letter
        // using TURKISH and ENGLISH language
        String tr = s2.toUpperCase(TURKISH);
        String en = s2.toUpperCase(ENGLISH);
        System.out.println("tr string -> " + tr);
        System.out.println("en string -> " + en);
        System.out.println();
    }
}