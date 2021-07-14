// what is the Integer Class is in Java?
// let's find out
public class IntegerClass {
    /* - is a wrapper class for the primitive type int

       Constructor:
       Integer(int x)

       Syntax:
       public Integer(int x)

       Parameters:
       x - value with which to initialize

       Integer(String s)
       -  create an Integer object initialized with the int value
       provided by string representation.

       Syntax:
       public Integer(String s) throws NumberFormatException
       Parameters:
       s - string representation of the int value
     */

    public static void main(String[] args) {
        System.out.println("---< Integer Class is in Java >---\n");

        // methods:
        // 1. .toString() - returns the string corresponding to the int value
        System.out.println("1. .toString() - returns the string corresponding to the int value ->");
        int int1 = 65;
        System.out.println("int1 = " + int1);
        String s1 = Integer.toString(int1);
        System.out.println("s1 from int1 -> " + s1);
        System.out.println();

        // 2. .toHexString() - returns a string representing the int value in hex characters-[0-9][a-f]
        System.out.println("2. .toHexString() - returns a string representing the int value in hex characters-[0-9][a-f]  ->");
        int int2 = 0xCAFEBABE;
        System.out.println("int2 = " + int2);
        String s2 = Integer.toHexString(int2);
        System.out.println("s2 in hexadecimal from int2 -> " + s2);
        System.out.println();

        // 3. .toOctaString() - returns a string representing the int value in octal characters-[0-7]
        System.out.println("3. .toOctaString() - returns a string representing the int value in octal characters-[0-7]  ->");
        int int3 = 8;
        System.out.println("int3 = " + int3);
        String s3 = Integer.toOctalString(int3);
        System.out.println("s3 in octal from int3 -> " + s3);
        System.out.println();

        // 4. .toBinaryString() - returns a string representing the int value in binary characters-[0/1]
        System.out.println("4. .toBinaryString() - returns a string representing the int value in binary characters-[0/1] ->");
        int int4 = 7;
        System.out.println("int4 = " + int4);
        String s4 = Integer.toBinaryString(int4);
        System.out.println("s4 in binary from int4 -> " + s4);
        System.out.println();

        // 5. .valueOf() - returns the Integer object initialised with the value provided
        System.out.println("5. .valueOf() - returns the Integer object initialised with the value provided ->");
        int int5 = 33;
        Integer integer5 = Integer.valueOf(int5); // boxing
        System.out.println("Integer from int -> " + integer5);
        System.out.println();

        // 6. .valueOf(String value) - returns Integer from string
        System.out.println("6. .valueOf(String value) - returns Integer from string -> ");
        String s6 = "007";
        System.out.println("s6 -> " + s6);
        Integer integer6 = Integer.valueOf(s6);
        System.out.println(".valueOf(007) -> " + integer6);
        System.out.println();

        // 7. .valueOf(String value, radix) - returns Integer from string using radix
        System.out.println("7. .valueOf(String value, radix) - returns Integer from string using radix ->");
        String s7 = "111";
        System.out.println("s7 -> " + s7);
        Integer integer7 = Integer.valueOf(s7, 2);
        System.out.println(".valueOf(111, 2) -> " +integer7);
        System.out.println();

        // 8. .decode() - decodes Integer from string (decimal, hexadecimal, octal representation)
        System.out.println("8. .decode() - decodes Integer from string (decimal, hexadecimal, octal representation) ->");
        String decimal = "45";
        String octal = "007";
        String hex = "0xCAFE";
        System.out.println("decode(45) -> " + decimal);
        System.out.println("decode(007) -> " + octal);
        System.out.println("decode(0xCAFE) -> " + hex);
        System.out.println();

        // 9. .rotateLeft() / .rotateRight() - used to rotate bits by specified distance
        System.out.println("9. .rotateLeft() / .rotateRight() - used to rotate bits by specified distance ->");
        int valueRotate = 2;
        System.out.println("valueRotate = " + valueRotate);
        int rotateLeft = Integer.rotateLeft(valueRotate, 2);
        System.out.println("rotateLeft(valueRotate, 2) -> " + rotateLeft);
        int rotateRight = Integer.rotateRight(valueRotate, 1);
        System.out.println("rotateRight(valueRotate, 1) -> " + rotateRight);
        System.out.println();
    }
}