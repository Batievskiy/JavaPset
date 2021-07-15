// what is Double Class in Java?
// let's find out
public class DoubleClass {
    /*
    - is a wrapper class for the primitive type double
     */
    public static void main(String[] args) {
        System.out.println("--< Double Class in Java >---\n");
        // methods:
        // 1. .toString() - returns the string corresponding to the double value
        System.out.println("1. .toString() - returns the string corresponding to the double value ->");
        double d1 = 77.07;
        String s1 = "3.14";
        System.out.println("toString(d1) -> " + Double.toString(d1));
        System.out.println();

        // 2. .valueOf() - returns the Double object initialized with the value provided
        System.out.println("2. .valueOf() - returns the Double object initialized with the value provided ->");
        Double d2 = Double.valueOf(s1);
        System.out.println("valueOf(s1) -> " + d2);
        Double x = d1;
        Double y = 3.14;

        System.out.println("byteValue(x) -> " + x.byteValue());
        System.out.println("shortValue(x) -> " + x.shortValue());
        System.out.println("intValue(x) -> " + x.intValue());
        System.out.println("longValue(x) -> " + x.longValue());
        System.out.println("doubleValue(x) -> " + x.doubleValue());
        System.out.println("floatValue(x) -> " + x.floatValue());
        System.out.println();

        // 3. .hashCode() - returns the hashcode corresponding to this Double Object
        System.out.println("3. .hashCode() - returns the hashcode corresponding to this Double Object ->");
        int hash = x.hashCode();
        System.out.println("hashCode(x) -> " + hash);
        System.out.println();

        // 4. .equals() - returns true if both the objects contains same double value
        System.out.println("4. .equals() - returns true if both the objects contains same double value ->");
        boolean isEquals = x.equals(y);
        System.out.println("x.equals(y) -> " + isEquals);
        System.out.println();

        // 5. .compare() - compare two primitive double values for numerical equality
        System.out.println("5. .compare() - compare two primitive double values for numerical equality ->");
        int compared = Double.compare(x, y);
        System.out.println("compare(x, y) -> " + compared);
        System.out.println();

        // 6. .isNaN() - returns true if the double object in consideration is not a number, otherwise false
        System.out.println("6. .isNaN() - returns true if the double object in consideration is not a number, otherwise false ->");
        Double d3 = Double.valueOf("1010.54789654123654");
        System.out.println("isNaN(d) -> " + d3.isNaN());
        System.out.println("Double.isNaN(45.12452) -> " + Double.isNaN(45.12452));
        System.out.println();

        // 7. .isInfinite() - returns true if the double object in consideration is very large, otherwise false
        System.out.println("7. .isInfinite() - returns true if the double object in consideration is very large, otherwise false ->");
        Double infinite = Double.POSITIVE_INFINITY + 1;
        System.out.println("Double.isInfinite(infinite) -> " + Double.isInfinite(infinite));
        System.out.println();

        // 8. .toHexString() - returns hexadecimal string representation
        System.out.println("8. .toHexString() - returns hexadecimal string representation ->");
        double hex = 1024.283759;
        System.out.println("Double.toHexString(hex) -> " + Double.toHexString(hex));
        System.out.println();

        // 9. .double.ToLongBits() - returns the IEEE 754 floating-point “double format” bit layout of the given double argument
        System.out.println("9. .double.ToLongBits() - returns the IEEE 754 floating-point “double format” bit layout of the given double argument ->");
        double dd = 10245.21452;
        long doubleToLong = Double.doubleToLongBits(dd);
        System.out.println("Double.doubleToLongBits(dd) = " + doubleToLong);

        double longToDouble = Double.longBitsToDouble(doubleToLong);
        System.out.println("Double.LongBitsToDouble(longToDouble) = " +
                longToDouble);
        System.out.println();

        // 10. .parseDouble() - returns double from string
        System.out.println("10. .parseDouble() - returns double from string ->");
        System.out.println("parseDouble(s1) -> " + Double.parseDouble(s1));
        System.out.println();
    }
}
