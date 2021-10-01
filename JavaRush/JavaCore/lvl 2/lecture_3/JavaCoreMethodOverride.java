public class JavaCoreMethodOverride {
    public static void main(String[] args) {
        Robot robot = new Robot();
        System.out.println(robot.toString());
        System.out.println();

        // and lets override toString() method
        Robot2 robot2 = new Robot2("Chappie");
        System.out.println(robot2.toString());
        System.out.println();

        Robot3 robot3 = new Robot3("Mark", 1, 1);
        System.out.println(robot3);
        robot3.forward(10);
        System.out.println();

        RobotBest robotBest = new RobotBest("T800", 1, 1);
        System.out.println(robotBest);
        robotBest.forward(20);
    }
}

class Robot {

}

class Robot2 extends Robot {
    private String name;

    public Robot2() {

    }

    public Robot2(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Robot name : " + name;
    }
}

class Robot3 extends Robot2 {
    private double x = 0;
    private double y = 0;
    protected double course = 0;

    public Robot3() {

    }

    public Robot3(String name, double x, double y) {
        super(name);
        this.x = x;
        this.y = y;
    }

    public void forward(int distance) {
        System.out.println("Moving forward to : " + distance);
        x += distance * Math.cos(course / 180 * Math.PI);
        y += distance * Math.sin(course / 180 * Math.PI);
    }

    public void printCoordinates() {
        System.out.println(x + ", " + y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }
}

class RobotBest extends Robot3 {
    private double totalDistance = 0;

    public RobotBest(String name, double x, double y) {
        super(name, x, y);
    }
    @Override
    public void forward(int distance) {
        super.forward(distance);
        totalDistance += distance;
        System.out.println("totalDistance : " + totalDistance);
    }

    public double getTotalDistance() {
        return totalDistance;
    }
}