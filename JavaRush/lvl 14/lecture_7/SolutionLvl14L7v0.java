// change method getMonthByIndex() using switch

public class SolutionLvl14L7v0 {
    public static void main(String[] args) {
        System.out.println(getMonthByIndex(4));
        System.out.println(getMonthByIndex(8));
        System.out.println(getMonthByIndex(12));
    }

//    public static String getMonthByIndex(int monthIndex) {
//        String monthString;
//        if (monthIndex == 1) {
//            monthString = "Январь";
//        } else if (monthIndex == 2) {
//            monthString = "Февраль";
//        } else if (monthIndex == 3) {
//            monthString = "Март";
//        } else if (monthIndex == 4) {
//            monthString = "Апрель";
//        } else if (monthIndex == 5) {
//            monthString = "Май";
//        } else if (monthIndex == 6) {
//            monthString = "Июнь";
//        } else if (monthIndex == 7) {
//            monthString = "Июль";
//        } else if (monthIndex == 8) {
//            monthString = "Август";
//        } else if (monthIndex == 9) {
//            monthString = "Сентябрь";
//        } else if (monthIndex == 10) {
//            monthString = "Октябрь";
//        } else if (monthIndex == 11) {
//            monthString = "Ноябрь";
//        } else if (monthIndex == 12) {
//            monthString = "Декабрь";
//        } else {
//            monthString = "Недействительный месяц";
//        }
//        return monthString;
//    }

    // changed method
    public static String getMonthByIndex(int index) {
        return switch (index) {
            case 1 -> "Январь";
            case 2 -> "Февраль";
            case 3 -> "Март";
            case 4 -> "Апрель";
            case 5 -> "Май";
            case 6 -> "Июнь";
            case 7 -> "Июль";
            case 8 -> "Август";
            case 9 -> "Сентябрь";
            case 10 -> "Октябрь";
            case 11 -> "Ноябрь";
            case 12 -> "Декабрь";
            default -> "Недействительный месяц";
        };
    }
}
