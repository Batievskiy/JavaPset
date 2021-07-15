// what is Boolean Class in Java?
// let's find out
public class BooleanClass {
    // Boolean class wraps primitive type boolean value in an object.
    public static void main(String[] args) {

        Boolean bool1 = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        System.out.println("bool1 -> " + bool1);
        System.out.println("bool2 -> " + bool2);
        System.out.println();

        // methods:
        // 1. .booleanValue() - assign value of a Boolean object to boolean primitive.
        System.out.println("1. .booleanValue() - assign value of a Boolean object to boolean primitive. ->");
        boolean bool3 = bool1.booleanValue(); // primitive
        System.out.println("bool1.booleanValue() -> " + bool3);
        System.out.println();

        // 2. .compareTo() - compares this Boolean instance with the passed Boolean instance.
        System.out.println("2. .compareTo() - compares this Boolean instance with the passed Boolean instance. ->");
        int compare = bool1.compareTo(bool2);
        System.out.println("bool1.compareTo(bool2) -> " + compare);
        System.out.println("bool2.compareTo(bool3) -> " + bool2.compareTo(bool3));
        System.out.println();

        // 3. .hashCode() - returns hash code value for the assigned boolean object.
        System.out.println("3. .hashCode() - returns hash code value for the assigned boolean object. ->");
        System.out.println("hashCode(bool1) -> " + bool1.hashCode());
        System.out.println();

        // 4. .getBoolean() - returns true, if ‘true’ value is assigned to the System property.
        System.out.println("4. .getBoolean() - returns true, if ‘true’ value is assigned to the System property. ->");
        System.setProperty("p1", "true");
        System.setProperty("p2", "false");
        System.out.println("getBoolean(\"p1\") -> " + Boolean.getBoolean("p1"));
        System.out.println("getBoolean(\"p2\") -> " + Boolean.getBoolean("p2"));
        System.out.println();

        // 5. .valueOf() - returns the value assigned to the Boolean variable.
        System.out.println("5. .valueOf() - returns the value assigned to the Boolean variable. ->");
        System.out.println("valueOf(bool1) -> " + Boolean.valueOf(bool1));
        System.out.println("valueOf(bool2) -> " + Boolean.valueOf(bool2));
        System.out.println();

        // 6. .parseBoolean() - returns true or false value of String argument(taken by it as Boolean).
        System.out.println("6. .parseBoolean() - returns true or false value of String argument(taken by it as Boolean). ->");
        System.out.println("parseBoolean(\"true\") -> " + Boolean.parseBoolean("true"));
        System.out.println("parseBoolean(\"false\") -> " + Boolean.parseBoolean("false"));
        System.out.println();
    }
}
