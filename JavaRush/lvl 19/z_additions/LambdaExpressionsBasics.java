import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class LambdaExpressionsBasics {
    public static void main(String[] args) {

        //
        String[] arrayString1 = {"hello", "my", "java", "world", "!"};
        String[] arrayString2 = {"no", "more", "tears"};
        String[] arrayString3 = {"lessssssss", "wordzzzz"};

        List<String[]> listOfArrays = new ArrayList<>();
        listOfArrays.add(arrayString1);
        listOfArrays.add(arrayString2);
        listOfArrays.add(arrayString3);

        for (String[] array : listOfArrays) {
            System.out.println(Arrays.toString(array));
        }

        // this Comparator sorts the List of the Arrays by the number ow words in the Arrays
        Comparator<String[]> sortByNumberOfWords = new Comparator<String[]>() {
            @Override
            public int compare(String[] strArray1, String[] strArray2) {
                return strArray1.length - strArray2.length;
            }
        };

        // this Comparator rule
        // - sorts the list of the Arrays by length of all words
        // in each Array in ascending order.
        Comparator<String[]> sortByAllWordsLengthComparator = new Comparator<String[]>() {
            @Override
            public int compare(String[] strArray1, String[] strArray2) {
                int length1 = 0;
                int length2 = 0;

                for (String s : strArray1) {
                    length1 += s.length();
                }

                for (String s : strArray2) {
                    length2 += s.length();
                }
                return length1 - length2;
            }
        };

        System.out.println("Sorting by longest sum of strings in array");
        listOfArrays.sort(sortByAllWordsLengthComparator);
        for (int i = 0; i < listOfArrays.size(); i++) {
            System.out.print("length of strings -> " + sumOfLengthsOfWords(listOfArrays, i) + " : ");
            System.out.println(Arrays.toString(listOfArrays.get(i)));
        }
        System.out.println();

        System.out.println("Sorting by number of strings in array:");
        listOfArrays.sort(sortByNumberOfWords);
        for (String[] listOfArray : listOfArrays) {
            System.out.print("number of words -> " + listOfArray.length + " : ");
            System.out.println(Arrays.toString(listOfArray));
        }

    }

    public static int sumOfLengthsOfWords(List<String[]> arrayList, int index) {
        return Arrays
                .stream(arrayList.get(index))
                .mapToInt(String::length)
                .sum();
    }
}
