// what is .replace methods in Java?
// let's find out
public class ReplaceStringMethods {
    public static void main(String[] args) {
        System.out.println("---< .replace methods in Java >---");
        // here are three variants of replace() method.

        // 1. .replace('old char', 'new char') - returns a new string with replaced chars
        System.out.println("1. .replace('old char', 'new char') - returns a new string with replaced chars ->");
        String s1 = new String("hello ! world ! of ! Java");
        System.out.println("replaced 'o' to '0' -> " + s1.replace('o', '0'));
        System.out.println();

        // 2. .replace("string", "string") - returns a new string with replaced string
        System.out.println("2. .replace(\"string\", \"string\") - returns a new string with replaced string ->");
        System.out.println("replaced \"! \" to \"\" -> " + s1.replace("! ", ""));
        System.out.println();

        // 3. .replaceAll(RegEx, "string") - return a new string with replaced parts using Regular Expressions
        System.out.println("3. .replaceAll(RegEx, \"string\") - return a new string" +
                " with replaced parts using Regular Expressions ->");
        System.out.println("replaced all \"o\" -> " + s1.replaceAll("o", "JAVA"));
        System.out.println();

        // 4. .replaceFirst() - replaces the first substring that matches the RegEx
        System.out.println("4. .replaceFirst() - replaces the first substring that matches the RegEx ->");
        System.out.println("replaced first '!' -> " + s1.replaceFirst("!", "OOPS"));
    }
}