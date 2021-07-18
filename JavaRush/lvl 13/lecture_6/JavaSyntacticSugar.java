import java.util.ArrayList;
import java.util.Scanner;

// what is Syntactic Sugar in Java?
// let's find out
public class JavaSyntacticSugar {
    public static void main(String[] args) {

        // This is a short way of writing commands

        // Examples:

        // Integer a = new Integer(5); <--- long way
        Integer a = 5; // <--- short one

        int b = a.intValue(); // <--- unnecessary unboxing
        int c = a; // <--- keep it simple ;)

        // Integer x = new Integer(7); // <--- no no no!
        Integer x = 7; // <--- this way ;)
        int y = 1;
        if (x.intValue() == b) { // <-- unnecessary unboxing
            System.out.println("bad!");
        }
        if (x == y) {
            System.out.println("good ;)");
        }

        // brand new variable ---> var <--- uses its value as detection of its type
        int integer = 77;
        var integerVar = 77; // type of integer

        String string1 = "hello";
        var stringVar = "hello"; // type of String

        Scanner scanner = new Scanner(System.in);
        var scannerVar = new Scanner(System.in); // type of Scanner

        ArrayList<String> arrayList = new ArrayList<>();
        var arrayListVar = new ArrayList<String>(); // type of ArrayList

        int[] array = new int[]{1, 2, 3};
        var arrayVar = new int[]{1, 2, 3}; // type of array

        // ...and so on...
        /* BUT ---> do not abuse these features <---

           var stream = url.getInputStream(); // <--- good idea
           var name = person.getFullName(); // <--- OK idea

           var result = task.execute(); // <--- BAD idea (can't clearly get the type of var)
           var status = person.getStatus(); // <--- BAD idea (same point here)

           var data = stream.getMetaData(); <--- OK, because it's not important what data type that was
           storage.save(data);
        */

        /* three examples:

           dest.writeHeaderInfo(src.getFileMetaInfo()); <--- Too short!

           var headerInfo = src.getFileMetaInfo(0);
           dest.writeHeaderInfo(headerInfo); <--- NICE ;)

           FileMetaInfo headerInfo = src.getFileMetaInfo();
           dest.writeHeaderInfo(headerInfo); <--- Too long ;(

         */

        // operator diamond: <>
        ArrayList<String> arrayList1 = new ArrayList<String>(); // <--- a bit redundant
        ArrayList<String> arrayList2 = new ArrayList<>();
        var arrayList3 = new ArrayList<String>();

        // curley braces for Arrays {}
        int[] data1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] data2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        // but what about collections?
        // Double curley braces {{ }}
        var arrayListBraces = new ArrayList<String>()
        {{
            add("Hello");
            add("Java");
            add("World");
        }};
        System.out.println(arrayListBraces);
    }
}
