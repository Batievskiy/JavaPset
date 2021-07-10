import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MistakesJavaRush {
//    public static int a = 99;
//    public static int i = 100;
    public static int value = 99;
    public static int count = 100;

    public static void main(String[] args) {

        // 1. ---< Comparing a Strings using "==" >---
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        // incorrect:
//        if (s1 == s2) {
//            System.out.println("Strings are equal"); // but they are not!
//        }
        // correct way:
        if (s1.equals(s2)) {
            System.out.println("strings re equals!"); // and they indeed
        }


        // 2. ---< Fictive changing of a String >---
        String string = "Hello";
        // incorrect:
        // string.toUpperCase(); // has just created a new String with method work result
        // correct way:
        String result = string.toUpperCase();


        // 3. ---< Forget to initialize array-variable
        // incorrect:
//        int[] array;
//        array[0] = 1;
//        array[1] = 2;
        // correct way:
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;


        // 4. ---< Replacing a local variable>---
        // incorrect:
//        int[] a = new int[i];
//        for (int i = 0; i < 10; i++) {
//            a[i] = a; // here we replace its value
//        }
        // correct way:
        int[] a = new int[count];
        for (int i = 0; i < 10; i++) {
            a[i] = value;
        }


        // 5. ---< Removing elements from Collections >---
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 0, -5, -7, -12, 5, 15);

        // you can't move through the Collection elements and change the same Collection
//        for (Integer value : arrayList) {
//            if (value < 0)
//                arrayList.remove(value);
//        }
        // need to use .removeIf method
        arrayList.removeIf(value -> value < 0);


        // 6. ---< Calling nonstatic methods from a static main >---
        // incorrect:
//        int[] arr = createArrayNonStatic();

        // correct way:
        int[] arr = createArrayStatic();
        // or using Object reference:
        MistakesJavaRush mjr = new MistakesJavaRush();
        int[] arRay = mjr.createArrayNonStatic();
        
    }
    public int n = 100;
    public int[] createArrayNonStatic() {
        return new int[n];
    }
    public static int m = 100;
    public static int[] createArrayStatic() {
        return new int[m];
    }
}

        // ---< More than one public Class in a file >---
// incorrect:
//public class IamPublicToo {
//
//}

// correct way:
class IamRegularClass {

}
