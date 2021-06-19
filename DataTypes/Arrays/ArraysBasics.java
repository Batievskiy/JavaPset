// what is Arrays in Java?
// let's find out
public class ArraysBasics {
    public static void main(String[] args) {
        System.out.println("---< Arrays in Java >---\n");

        /* An Array is a group of like-typed variables that are referred to by a common name
           
           Array element has its Index from 0 to N and its Value
           array-name[index] = value;
           
           Arrays can store different types of data:
           byte[]
           short[]
           boolean[]
           long[]
           float[]
           double[]
           char[]
           
           Object[] // array of Object
           Collection[] // array of Collection
           
        */

        // let's create an array
        // 1. type[] var-name = type[]{value1, value2, ..., valueN};
        System.out.println("1. Create an array ->\ntype[] var-name = new type[]{value1, value2, ..., valueN};");
        int[] arr1 = new int[]{1, 2, 3, 4, 7, 15};
        System.out.println();

        // 2. print out arrays using enhanced for loop
        System.out.println("2. print out arrays using enhanced for loop ->");
        for (int value : arr1) {
            System.out.print(value + ", ");
        }
        System.out.println("\n");

        //
        // 3. create array with size - type[] var-name = type[size];
        System.out.println("3. create array with size ->\ntype[] var-name = type[size];");
        int size = 4;
        int[] arr2 = new int[size];
        System.out.println();

        // 4. Add some values inside -> var-name[index] = value;
        System.out.println("4. Add some values inside ->\nvar-name[index] = value;");
        arr2[0] = 11;
        arr2[1] = 33;
        arr2[2] = 55;
        arr2[3] = 77;
        System.out.println();

        // 5. Print out arrays using classic for loop
        System.out.println("5. Print out arrays using classic for loop ->");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i < arr2.length - 1) {
                System.out.print(", "); // don't print last ", "
            }
        }
        System.out.println();
    }
}
