// what is .startsWith() and .endsWith() in Java?
// let's find out
public class StartsEndsWithMethods {
    public static void main(String[] args) {
        System.out.println("---< .startsWith() and .endsWith() in Java >---\n");

        // 1.  .startsWith() - tests if a string starts with
        // the specified prefix beginning from 1st index.
        System.out.println("1. .startsWith() - tests if a string starts with\n" +
                "the specified prefix beginning from 1st index ->");

        String s1 = new String("Hello world of Java");
        System.out.println("s1 -> " + s1);
        // test prefix using .startsWith()
        System.out.print("does s1 starts with \"Hello\"? -> ");
        System.out.println(s1.startsWith("Hello"));
        System.out.println();

        // 2. .startsWith(String prefix, int stringPosition) - tests if a string starts with
        // the specified prefix beginning from  specified index.
        System.out.println("2. .startsWith(String prefix, int stringPosition) - tests if a string starts with\n" +
                "the specified prefix beginning from  specified index ->");
        System.out.println("s1 -> " + s1);
        System.out.print("does s1 starts with \"Java\" on index 15 position? -> ");
        System.out.println(s1.startsWith("Java", 15));
        System.out.println();

        // 3. .endWith() - checks whether the string ends with a specified suffix
        System.out.println("3. .endWith() - checks whether the string ends with a specified suffix ->");
        System.out.println("s1 -> " + s1);
        System.out.print("does s1 ends with \"Java\" suffix? -> ");
        System.out.println(s1.endsWith("Java"));
        System.out.println();
    }
}