public class SimpleRobotListener implements RobotListener {
    @Override
    public void startMove(double x, double y) {
        System.out.println("The robot started moving, coordinates: " +
                x + ", " + y);
    }

    @Override
    public void endMove(double x, double y) {
        System.out.println("The robot has finished moving, coordinates: " +
                x + ", " + y);
    }
}
