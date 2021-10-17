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

package ua.com.alevel.findLessonEndTime;

import ua.com.alevel.interfaces.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.InputMismatchException;

public class FindLessonEndTime implements Game {

    private static final String TITLE = "\n---< Lesson End Time by its number >---\n";
    private static final int START_HOUR = 9 * 60; // first lesson hours
    private static final int LESSON_DURATION = 45; // lesson minutes
    private static final int BREAK_1 = 5; // first break minutes
    private static final int BREAK_2 = 15; // second break minutes

    @Override
    public void play(BufferedReader bufferedReader) throws IOException {
        title();

        int lessonNumber = getLessonNumber(bufferedReader);

        printLessonEndTime(lessonNumber);
    }

    private static void printLessonEndTime(Integer lessonNumber) {
        int n = lessonNumber;
        int totalDuration = n * LESSON_DURATION + (n / 2) * BREAK_1 + ((n - 1) / 2) * BREAK_2;
        int totalHours = (totalDuration + START_HOUR) / 60;
        int totalMinutes = (totalDuration + START_HOUR) % 60;
        System.out.printf("............ends at -> %d:%02d%n\n", totalHours, totalMinutes);
    }

    private static int getLessonNumber(BufferedReader bufferedReader) throws IOException {
        String lessonNumber;
        while (true) {
            System.out.print("Enter lesson number -> ");
            lessonNumber = bufferedReader.readLine();
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
        System.out.println("\nInvalid lesson number!");
        System.out.println(".......must be 1 to 10\n");
    }

    private static void title() {
        System.out.println(TITLE);
    }
}