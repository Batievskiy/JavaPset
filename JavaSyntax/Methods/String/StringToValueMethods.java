// how to convert String to value in Java?
// let's find out
public class StringToValueMethods {
    public static void main(String[] args) {
        System.out.println("---< convert String to value in Java >---\n");

        // In Java there is some methods for converting String into a value

        // 1. Integer.parseInt("String") - converts a String into an Int
        System.out.println("1. Integer.parseInt(\"String\") - converts a String into int ->");
        String s1 = "33 letters"; // as you can see string contains letters
        System.out.println("s1 -> " + s1);
        // let's use .replaceAll(RegEx, replacement) to replace all letters with ""
        Integer i = Integer.parseInt(s1.replaceAll("[\\D]", ""));
        System.out.println("parsed int -> " + i);
        System.out.println();

        // 2. Long.parseLong("String") - converts a String into a Long
        System.out.println("2. Long.parseLong(\"String\") - converts a String into a Long ->");
        System.out.println("");
        String s2 = "1233894924299131356L";
        System.out.println("s2 -> " + s2);
        Long l = Long.parseLong(s2.replaceAll("[\\D]", ""));
        System.out.println("parsed long -> " + l);
        System.out.println();

        /* and so on...
            Boolean.parseBoolean();
            Double.parseDouble();
            Float.parseFloat();
            Short.parseShort()
            Byte.parseByte();
        */
    }
}
