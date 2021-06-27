// what is .lastIndexOf methods in Java
// let's find out
public class LastIndexOfMethod {
    public static void main(String[] args) {
        System.out.println("---< .lastIndexOf methods in Java >---");

        // There are four variants of lastIndexOf() method.

        // 1. .lastIndexOf('char') - returns the index of the last occurrence
        // of the character in the character sequence.
        System.out.println("1. .lastIndexOf('char') - returns the index of the last occurrence\n" +
                "of the character in the character sequence ->");
        String s1 = new String("Hello world of Java");
        System.out.println("last index of 'a' is -> " + s1.lastIndexOf('a'));
        System.out.println();

        // 2. lastIndexOf('char', fromIndex) - returns the index of the last occurrence
        // of the character before fromIndex,
        // or -1 if the character does not occur before that point.
        System.out.println("2. lastIndexOf('char', fromIndex) - returns the index of the last occurrence\n" +
                "of the character before fromIndex ->");
        System.out.println("last before index 5 -> " + s1.lastIndexOf('o', 5));
        System.out.println();

        // 3. .lastIndexOf("String") - returns the index of the first character
        // of the last such substring is returned.
        // If it does not occur as a substring, -1 is returned.
        System.out.println("3. .lastIndexOf(\"String\") - returns the index of the first character\n" +
                "of the last such substring is returned ->");
        System.out.println("first char index of the last string -> " + s1.indexOf("world"));

        // 4. . lastIndexOf("String", fromIndex) - returns the index of the last occurrence
        // of the specified substring, searching backward starting at the specified index.
        System.out.println("4. . lastIndexOf(\"String\", fromIndex) - returns the index of the last occurrence\n" +
                "of the specified substring, searching backward starting at the specified index ->");
        System.out.println("last string index before 3 - > " + s1.indexOf("world", 3));
    }
}