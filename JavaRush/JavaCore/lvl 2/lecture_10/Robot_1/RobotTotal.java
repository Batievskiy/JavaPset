public class RobotTotal extends Robot {

    public double totalDistance = 0;

    // constructor can also be overloaded
    public RobotTotal() {
        super(0, 0);
    }

    public RobotTotal(double x, double y) {
        super(x, y);
    }

    @Override
    public void forward(int distance) {
        // call a method of the parent
        super.forward(distance);
        totalDistance += distance;
    }

    public double getTotalDistance() {
        return totalDistance;
    }
}
