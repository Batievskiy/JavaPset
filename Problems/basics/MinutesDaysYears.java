import java.util.Scanner;

public class MinutesDaysYears {
    private static final Scanner sc = new Scanner(System.in);
    private static final double minutesInYear = 60 * 24 * 365;

    public static void main(String[] args) {
        double minutes = getMinutes();
        int days = (int) minutesToDays(minutes);
        long years = (long) minutesToYears(minutes);

        System.out.printf("%d minutes is approximately %d years and %d days",(int) minutes, years, days);
    }

    private static double minutesToYears(double minutes) {
        return minutes / minutesInYear;
    }

    private static double minutesToDays(double minutes) {
        return (minutes / 60 / 24) % 365;
    }

    private static double getMinutes() {
        String minutes;
        do {
            System.out.print("enter minutes: ");
            minutes = sc.nextLine().trim();
            if (!minutes.matches("(-?)\\d+")) {
                System.out.println("not a minutes!");
                minutes = "";
            }
        } while (minutes.isEmpty());
        return Double.parseDouble(minutes);
    }
}
