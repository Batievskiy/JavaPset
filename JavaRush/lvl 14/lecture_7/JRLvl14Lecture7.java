// JavaRush lvl 14 lecture 7
// switch operator in java
public class JRLvl14Lecture7 {
    public static void main(String[] args) {
        int t = 40;

        // switch vs if-else
        if (t == 36) {
            System.out.println("low");
        } else if (t == 37) {
            System.out.println("normal");
        } else if (t == 38) {
            System.out.println("high");
        } else {
            System.out.println("need help");
        }

        switch (t) {
            case 36:
                System.out.println("low");
                break;
            case 37:
                System.out.println("normal");
                break;
            case 38:
                System.out.println("high");
                break;
            default:
                System.out.println("need help");
        }

        // enhanced switch:
        switch (t) {
            case 36 -> System.out.println("low");
            case 37 -> System.out.println("normal");
            case 38 -> System.out.println("high");
            default -> System.out.println("need help");
        }

    }
}
