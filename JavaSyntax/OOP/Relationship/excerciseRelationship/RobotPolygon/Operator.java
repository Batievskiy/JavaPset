public class Operator {

    private String firstName;
    private String lastName;

    // The Operator can control Robot
    private Robot robot;

    // Constructor for Operator
    public Operator(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return this.lastName = lastName;
    }

    // The operator can be asked which robot he controls
    public Robot getRobot() {
        return robot;
    }

    // The operator can be tasked with driving the robot
    public void setRobot(Robot robot) {
        this.robot = robot;
    }
}
