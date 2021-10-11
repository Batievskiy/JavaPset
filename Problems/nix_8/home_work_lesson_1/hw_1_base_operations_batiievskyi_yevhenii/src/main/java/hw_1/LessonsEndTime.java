// 1. In the school lessons starts at 9:00
// - lesson duration is 45 minutes
// - break duration after 1, 3, 5 ... N-th lesson is 5 minutes
// - break duration after 2, 4, 6 ... N-th lesson is 15 minutes

// 2. Ask user to input lesson number
// 3. Print out tome when this lesson ends.

// DON'T use if, while, for, ?, until, switch etc.

    /*

    let's figure out formula:

    n = lesson number
    f = 9 - first lesson hour
    l = 45 - lesson duration
    b1 = 5 - first break minutes
    b2 = 15 - second break minutes
    td = totalDuration - in minutes

    n = 1;
    td = (n + b1)

    n = 2;
    (l + b1) + (l + b2)
    td = (n * l) + (1 * b1) + (1 * b2)

    n = 3;
    (l + b1) + (l + b2) + (l + b1)
    td = (n * l) + (2 * b1) + (1 * b2)

    n = 4;
    (l + b1) + (l + b2) + (l + b1) + (l + b2)
    td = (n * l) + (2 * b1) + (2 * b2)

    n = 5;
    (l + b1) + (l + b2) + (l + b1) + (l + b2) + (l + b1)
    td = (n * l) + (3 * b1) + (2 * b2)

    n = 6;
    (l + b1) + (l + b2) + (l + b1) + (l + b2) + (l + b1) + (l + b2)
    td = (n * l) + (3 * b1) + (3 * b2)
    ...

    n = N
    td = (n * l) + (n / 2) * b1 + ((n - 1) / 2) * b2

     */

package hw_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LessonsEndTime {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int START_HOUR = 9 * 60; // first lesson hours
    private static final int LESSON_DURATION = 45; // lesson minutes
    private static final int BREAK_1 = 5; // first break minutes
    private static final int BREAK_2 = 15; // second break minutes

    public static void run() {
        title();
        play();
    }

    private static void play() {
        boolean isPlay = true;
        while (isPlay) {
            int lessonNumber = getLessonNumber();
            printLessonEndTime(lessonNumber);
            System.out.print("Want more? ( Y / N ) - > ");
            String s = "";
            while (s.isEmpty()) {
                s = SCANNER.nextLine();
                if (!s.toLowerCase().matches("[y]")) {
                    System.out.println("Bye-Bye ;)\n");
                    isPlay = false;
                    break;
                }
            }
        }
    }

    private static void printLessonEndTime(Integer lessonNumber) {
        int n = lessonNumber;
        int totalDuration = n * LESSON_DURATION + (n / 2) * BREAK_1 + ((n - 1) / 2) * BREAK_2;
        int totalHours = (totalDuration + START_HOUR) / 60;
        int totalMinutes = (totalDuration + START_HOUR) % 60;
        System.out.printf("............ends at -> %d:%02d%n\n", totalHours, totalMinutes);
    }

    private static int getLessonNumber() {
        String lessonNumber;
        while (true) {
            System.out.print("Enter lesson number -> ");
            lessonNumber = SCANNER.nextLine().trim();
            try {
                if (lessonNumber.matches("[1-9]|10")) {
                    break;
                } else {
                    printInvalidLessonNumber();
                }
            } catch (InputMismatchException | NumberFormatException e) {
                printInvalidLessonNumber();
            }
        }
        return Integer.parseInt(lessonNumber);
    }

    private static void printInvalidLessonNumber() {
        System.err.println("Invalid lesson number!");
        System.out.println(".......must be 1 to 10");
    }

    private static void title() {
        System.out.println("\n---< Lesson End Time by its number >---\n");
    }
}