// JavaRush lvl 10 lecture 5
// find index of first symbol from First word
// find index of first symbol from Last word
public class StringSearchJavaRush {
    public static void main(String[] args) {
        String string = "hello world good morning. good day.";
        String word = "good";
        int indexFromFirstWord = getIndexFromFirstWord(string, word);
        int indexFromLastWord = getIndexFromLastWord(string, word);
        System.out.println("index of first symbol from First word \"" + word + "\" equals - " + indexFromFirstWord);
        System.out.println("index of first symbol from Last word \"" + word + "\" equals - " + indexFromLastWord);
    }

    public static int getIndexFromFirstWord(String string, String word) {
        return string.indexOf(word);
    }

    public static int getIndexFromLastWord(String string, String word) {
        return string.lastIndexOf(word);
    }
}
