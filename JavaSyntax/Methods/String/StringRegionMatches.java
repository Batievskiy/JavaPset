// what is regionMatches method in Java?
// let's find out
public class StringRegionMatches {
    public static void main(String[] args) {
        System.out.println("---< regionMatches method in Java >---");
        /* .regionMatches() has two variants
        Case sensitive:
           public boolean regionMatches(int toffset, String other, int ooffset, int len)
        Case insensitive:
           public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
        *//*
        ignoreCase - if true, ignore case when comparing characters.
        toffset - the starting offset of the subregion in the string.
        other - the string argument being compared.
        ooffset - the starting offset of the subregion in the string argument.
        len: the number of characters to compare.
        *//*
        Return Value:
        - True if the specified subregion of this string matches the specified subregion of the string argument
        */

        String s1 = new String("hello world of Java");
        String s2 = new String("HELLO WORLD");
        String s3 = new String("hello world");
        System.out.println("s1 -> " + s1);
        System.out.println("s2 -> " + s2);
        System.out.println("s3 -> " + s3);
        System.out.println();

        // comparing s1 and s2
        System.out.print("s1 and s3 partially matches? -> ");
        System.out.println(s1.regionMatches(0, s3, 0, 11));
        System.out.println();

        //comparing s2 and s3 case insensitive
        System.out.print("s2 and s3 partially matches Ignore Case -> ");
        System.out.println(s2.regionMatches(true, 0, s3, 0, 11));
        System.out.println();
    }
}