
// Robot event listener interface
public interface RobotListener {
    // the method will be called when the movement starts
    public void startMove(double x, double y);

    // all the methods of the interface are public
    // so - we don't have to write access modifier.

    // the method will ve called when the movement ends
    void endMove(double x, double y);
}
