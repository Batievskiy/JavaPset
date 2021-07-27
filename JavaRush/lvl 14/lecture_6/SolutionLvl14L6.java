// JavaRush lvl 14 lecture 6 problem
// create seasons and print them out using Seasons.SEASON

enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN;
}
public class SolutionLvl14L6 {
    public static void main(String[] args) {

        System.out.println(Season.WINTER);
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);

        // indirect way
        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.println(season);
        }

    }
}
