/* JavaRush problem lvl 11 lecture 2
 BusinessCenter must contain:
 - two public constructors
 - constructor without parameters
 (initialize value "5" and "JavaRushDevelopment")
 - constructor with parameters type int and String
 (initialize with parameters)
 - private nonstatic int - floorCount
 - private nonstatic String - developer

 */
public class JavaRushBusinessCenter {
    private int floorCount;
    private String developer;

    JavaRushBusinessCenter() {
        this.floorCount = 5;
        this.developer = "JavaRushDevelopment";
    }

    JavaRushBusinessCenter(int floorCount, String developer) {
        this.floorCount = floorCount;
        this.developer = developer;
    }

    public static void main(String[] args) {
        JavaRushBusinessCenter businessCenter = new JavaRushBusinessCenter();
        JavaRushBusinessCenter businessCenterUnknown = new JavaRushBusinessCenter(50, "UNKNOWN");
    }
}
