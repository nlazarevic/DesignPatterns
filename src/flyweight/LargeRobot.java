package flyweight;

public class LargeRobot implements RobotInterface {
    @Override
    public void print() {
        System.out.println("This is a large robot");
    }
}
