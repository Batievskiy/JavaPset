// how to use indexes methods in Strings?
// let's find out
public class IndexesOfStringMethods {
    public static void main(String[] args) {
        System.out.println("---< How to use indexes methods in Strings >---\n");

        String s1 = new String("Hello world of Java");
        System.out.println("s1 -> " + s1);
        System.out.println();

        // 1. .indexOf('char') - returns the index of the first occurrence
        // of the specified character or -1, if the character does not occur.
        System.out.println("1. .indexOf('char') - returns the index of the first occurrence\n" +
                "of the specified character or -1, if the character does not occur ->");
        System.out.println("s1 -> " + s1);
        System.out.print("find index of 'H' -> ");
        System.out.println(s1.indexOf('H'));

        System.out.print("find index of 'w' -> ");
        System.out.println(s1.indexOf('w'));

        System.out.print("find index of 'J' -> ");
        System.out.println(s1.indexOf('J'));

        // 2. .indexOf("String") - returns the index of the first occurrence of the specified substring.
        // If it does not occur as a substring, -1 is returned.
        System.out.println("2. .indexOf(\"String\") - returns the index of the first occurrence" +
                "of the specified substring.\n" +
                "If it does not occur as a substring, -1 is returned. ->");
        System.out.print("find index of \"Hello\" -> ");
        System.out.println(s1.indexOf("Hello"));

        System.out.print("find index of \"world\" -> ");
        System.out.println(s1.indexOf("world"));

        System.out.print("find index of \"Java\" -> ");
        System.out.println(s1.indexOf("Java"));
        System.out.println();

        // 3. .indexOf('char', int start) - returns the index of char first occurrence
        // of the specified character, starting the search at the specified index or -1,
        // if the character does not occur.
        System.out.println("3. .indexOf('char', int start) - returns the index of char first occurrence\n" +
                "of the specified character, starting the search at the specified index or -1,\n" +
                "if the character does not occur ->");
        System.out.println("s1 -> " + s1);
        System.out.print("find index of 'o', starting from index 9 -> ");
        System.out.println(s1.indexOf('o', 9));
        System.out.println();

        // 4. .indexOf("String", int start) - returns the index  of the first occurrence
        // of the specified substring, starting at the specified index.
        // If it does not occur, -1 is returned.
        System.out.println("4. .indexOf(\"String\", int start) - returns the index  of the first occurrence\n" +
                "of the specified substring, starting at the specified index.\n" +
                "If it does not occur, -1 is returned. ->");
        System.out.println("s1 -> " + s1);
        System.out.print("find index of \"Java\", starting from index 9 -> ");
        System.out.println(s1.indexOf("Java", 9));
        System.out.println();
    }
}