// change method getTranslationForDayOfWeek() using if-else

public class SolutionLvl14L7v1 {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Monday"));
        System.out.println(getTranslationForDayOfWeek("Friday"));
        System.out.println(getTranslationForDayOfWeek("Sunnyday"));
    }

//    public static String getTranslationForDayOfWeek(String ru) {
//        String en;
//        switch (ru.toLowerCase()) {
//            case "monday":
//                en = "First";
//                break;
//            case "tuesday":
//                en = "Second";
//                break;
//            case "wednesday":
//                en = "Third";
//                break;
//            case "thursday":
//                en = "Forth";
//                break;
//            case "friday":
//                en = "Fifth";
//                break;
//            case "saturday":
//                en = "Sixth";
//                break;
//            case "sunday":
//                en = "Seventh";
//                break;
//            default:
//                en = "Unknown day";
//        }
//        return en;
//    }

    public static String getTranslationForDayOfWeek(String ru) {
        String s = ru.toLowerCase();
        System.out.println(s);
        String en;
        if (s.equals("monday")) {
            en = "First";
        } else if (ru.equalsIgnoreCase("tuesday")) {
            en = "Second";
        } else if (s.equals("wednesday")) {
            en = "Third";
        } else if (s.equals("thursday")) {
            en = "Forth";
        } else if (s.equals("friday")) {
            en = "Fifth";
        } else if (s.equals("saturday")) {
            en = "Sixth";
        } else if (s.equals("sunday")) {
            en = "Seventh";
        } else {
            en = "Unknown day";
        }
        return en;
    }
}
