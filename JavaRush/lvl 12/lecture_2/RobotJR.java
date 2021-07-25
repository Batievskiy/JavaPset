// JavaRush lvl 12 lecture 2 problem
// place "static" correctly
public class RobotJR {
    public static void main(String[] args) {
        System.out.println("Презентация роботов произведенных компанией " + Robot.vendor);

        Robot robot1 = new Robot("RCV-322", 2019);
        robot1.displayInformation();

        Robot robot2 = new Robot("JavaTron-008", 2017);
        robot2.displayInformation();

        Robot robot3 = new Robot("BugDestroyer-007", 1998);
        robot3.displayInformation();

        Robot robot4 = new Robot("Gundam-14", 2004);
        robot4.displayInformation();

        Robot robot5 = new Robot("Eve-2", 2012);
        robot5.displayInformation();
    }
}
class Robot {
    public static int robotCounter;

    public int id;

    public String model;

    public int productionYear;

    public static String vendor = "Javarush Co.";

    public Robot(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
        this.id = ++robotCounter;
    }

//    public void displayInformation() {
//        String oN = "th";
//        if (robotCounter == 1) {
//            oN = "-st";
//        } else if (robotCounter == 2) {
//            oN = "-nd";
//        } else if (robotCounter == 3) {
//            oN = "-rd";
//        } else {
//            oN = "-th";
//        }
//        System.out.printf("I am %d%s from %d robots. Model: %s. Created by: %s in %d year\n",
//                id, oN, robotCounter, model, vendor, productionYear);
//    }
    public void displayInformation() {
        String oN = "th";
        switch (robotCounter) {
            case 1:
                oN = "-st";
            case 2:
                oN = "-nd";
            case 3:
                oN = "-rd";
            default:
                oN = "-th";
        }
        System.out.printf("I am %d%s from %d robots. Model: %s. Created by: %s in %d year\n",
                id, oN, robotCounter, model, vendor, productionYear);
    }
}
