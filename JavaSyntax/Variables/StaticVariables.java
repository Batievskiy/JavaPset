import java.util.Scanner;

// how does static variables works in Java?
// let's find out
public class StaticVariables {

    /* As soon as the Class is loaded into memory,
       a static Object is immediately created for it.
       This Object stores static class variables.

       A static variable is always bound to a static Object
       of the Class and always exists in the final instance.
    */
    static Integer integer = 44;
    static int WIDTH = 100;
    static String message = "hello";
    static Scanner sc;
    static float pi = 3.14F;
    static boolean isGood;

    /* If static variables have not been initialized,
       they are assigned a default value:
       byte, short, int, long = 0;
       float = 0.0F;
       double = 0.0;
       char = '\u0000' (equals 0)
       boolean = false;
       Object and other Classes = null;
     */

    public static void main(String[] args) {
        /* How to access to a variable outside the Class?

        ClassName.variableName

        */
        StaticVariables.WIDTH = 1000;
        StaticVariables.isGood = true;
        StaticVariables.pi = (float) 3.14159265359;

    }


}
