// JavaRush lvl 13 lecture 2 problem
// create counters for strings - digits, letters, spaces
public class SolutionLvl13L2v5 {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int countDigit = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                countDigit++;
            }
        }
        return countDigit;
    }

    public static int countLetters(String string) {
        int countLetter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                countLetter++;
            }
        }
        return countLetter;
    }

    public static int countSpaces(String string) {
        int countSpace = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isSpaceChar(string.charAt(i))) {
                countSpace++;
            }
        }
        return countSpace;
    }
}
