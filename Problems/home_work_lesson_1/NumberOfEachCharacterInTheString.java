// 1. Get the string from user in console.
// 2. Parse all characters from this string.
// 3. Sort them.
// 4. Print out the number of occurrences of each character.

import java.util.*;
import java.util.stream.Collectors;

public class NumberOfEachCharacterInTheString {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        title();

        String string = getString();
        charOccurrenceCount(string);

        SCANNER.close();
    }

    private static void title() {
        System.out.println("\n---< Number of each character in the String >---\n");
    }

    private static String getString() {
        System.out.print("Input a string -> ");
        return SCANNER.nextLine();
    }

    private static void charOccurrenceCount(String sourceString) {
        // let's create Map to store character as a key
        // and number of occurrences as a value
        HashMap<Character, Integer> repeatedCharsMap = new HashMap<>();

        // let's convert String into character array

//        Pattern pattern = Pattern.compile("[a-zA-Z][А-яЁё][-А-яЁё]+", Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher(sourceString);
//
//        char[] charArray = Arrays.stream(sourceString.split(""))
//                .filter(c -> matcher.matches()) // [А-яЁё][-А-яЁё]+ // [a-zA-Z]+
//                .collect(Collectors.joining())
//                .toCharArray();


        char[] charArray = Arrays.stream(sourceString.split(""))
                .filter(c -> c.matches("[a-zA-Z]+")) // [А-яЁё][-А-яЁё]+ // [a-zA-Z]+ // [a-zA-Zа-яА-ЯёЁ]
                .collect(Collectors.joining())
                .toCharArray();


        // check what in array
//        System.out.println(Arrays.toString(charArray));

        // and iterate through all chars in charArray
        for (char currentChar : charArray) {
            // let's leave some space
            if (currentChar != ' ') {
                // check weather Map contains particular character
                if (repeatedCharsMap.containsKey(currentChar)) {
                    // increase current character value by 1
                    repeatedCharsMap.put(currentChar,
                            repeatedCharsMap.get(currentChar) + 1);
                } else {
                    // make a new entry
                    repeatedCharsMap.put(currentChar, 1);
                }
            }
        }

        // sort call
        Map<Character, Integer> sortedMapOfChars = sortByAlphabet(repeatedCharsMap);

        // and print all data
        int counter = 1;
        for (Map.Entry<Character, Integer> entry : sortedMapOfChars.entrySet()) {
            System.out.println(counter + ". " + entry.getKey() + " - " + entry.getValue());
            counter++;
        }
    }

    // sorting logic using list sort
    private static Map<Character, Integer> sortByAlphabet(Map<Character, Integer> mapOfRepeatedChars) {
        // let's get entry set from Map
        Set<Map.Entry<Character, Integer>> setOfCharEntry =
                mapOfRepeatedChars.entrySet();

        // and convert them into List of Map entries
        List<Map.Entry<Character, Integer>> listOfCharEntry =
                new ArrayList<>(setOfCharEntry);

        // now let's sort this lis of entries by alphabet
        listOfCharEntry.sort(Map.Entry.comparingByKey());

//        Collections.sort(listOfCharEntry,
//                new Comparator<Map.Entry<Character, Integer>>() {
//
//                    @Override
//                    public int compare(Map.Entry<Character, Integer> es1,
//                                       Map.Entry<Character, Integer> es2) {
//                        // by alphabet
//                        return es1.getKey().compareTo(es2.getKey());
//                        // upside down sort
//                        // return es2.getKey().compareTo(es1.getKey());
//                    }
//                });

        // store sorted list into Linked Hash Map
        Map<Character, Integer> charLinkedHashMap =
                new LinkedHashMap<>();

        for (Map.Entry<Character, Integer> map : listOfCharEntry) {
            charLinkedHashMap.put(map.getKey(), map.getValue());
        }

        return charLinkedHashMap;
    }
}
