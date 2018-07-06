package flyweight;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, RobotInterface> shapes = new HashMap<>();

    public int totalObjectCreated(){
        return shapes.size();
    }

    public RobotInterface getRobotFromFactory(String rCategory) throws Exception {
        RobotInterface robotCategory = null;

        if (shapes.containsKey(rCategory)){
            robotCategory = shapes.get(rCategory);
        }
        else {
            switch (rCategory){
                case "small":
                    System.out.println("We do not have small robot, so we will create a small robot now");
                    robotCategory = new SmallRobot();
                    shapes.put("small", robotCategory);
                    break;
                case "large":
                    System.out.println("We do not have large robot, so we will create a large robot now");
                    robotCategory = new LargeRobot();
                    shapes.put("large", robotCategory);
                    break;
                default:
                    throw new Exception("Robot Factory can create only small and large shapes");
            }
        }

        return robotCategory;
    }
}
