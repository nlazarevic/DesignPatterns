package facade.robotfacade;

import facade.robotparts.RobotBody;
import facade.robotparts.RobotColor;
import facade.robotparts.RobotMetal;

public class RobotFacade {
    RobotColor rc;
    RobotMetal rm;
    RobotBody rb;

    public RobotFacade() {
        rc = new RobotColor();
        rm = new RobotMetal();
        rb = new RobotBody();
    }

    public void constructRobot(String color, String metal){
        System.out.println("Creation of the robot start");
        rc.setColor(color);
        rm.setMetal(metal);
        rb.createBody();
        System.out.println("Robot creation end");
        System.out.println();
    }
}
