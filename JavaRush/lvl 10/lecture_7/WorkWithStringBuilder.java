// JavaRush lvl 10 lecture 7 problem
// Create two methods, using StringBuilder:
// addTo(String s1, String[] sArr)
// - adds all strings from array to String s1
// - and returns StringBuilder Object

// replace(String s1, String s2, int startIndex, int endIndex)
// - replace part of a string s1 from startIndex to endIndex with s2
// - returns StringBuilder Object
public class WorkWithStringBuilder {
    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";

        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String s1, String[] sArr) {
        StringBuilder stringBuilder = new StringBuilder(s1);
        for (String value : sArr) {
            stringBuilder.append(value);
        }
        return stringBuilder;
    }

    public static StringBuilder replace(String s1, String s2, int startIndex, int endIndex) {
        StringBuilder stringBuilder = new StringBuilder(s1);
        stringBuilder.replace(startIndex, endIndex, s2);
        return stringBuilder;
    }
}
