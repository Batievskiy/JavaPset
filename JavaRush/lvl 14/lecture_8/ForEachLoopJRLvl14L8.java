public class ForEachLoopJRLvl14L8 {
    public static void printAllGrades(int[] grades) {
        System.out.print("| ");
        for (int grade : grades) {
            System.out.print(grade + " | ");
        }
        System.out.println();
    }

    public static double averageGrade(int[] grades) {
        int gradeSum = 0;
        for (int grade : grades) {
            gradeSum += grade;
        }
        return ((double) gradeSum / grades.length);
    }

    public static int bestGrade(int[] grades) {
        int bestGrade = grades[0];

        for (int grade : grades) {
            if (grade > bestGrade) {
                bestGrade = grade;
            }
        }
        return bestGrade;
    }

    public static void main(String[] args) {

        int[] grades = {5, 10, 7, 8, 9, 12, 9, 7};

        int bestGrade = bestGrade(grades);
        System.out.print("all the grades -> ");
        printAllGrades(grades);
        System.out.println("best grade -> " + bestGrade);
        System.out.println("average grade -> " + averageGrade(grades));
    }
}
