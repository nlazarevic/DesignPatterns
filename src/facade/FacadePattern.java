package facade;

import facade.robotfacade.RobotFacade;

public class FacadePattern {
    public static void main(String[] args){
        System.out.println("---FACADE PATTERN---");
        RobotFacade rf1 = new RobotFacade();
        rf1.constructRobot("red", "iron");
        RobotFacade rf2 = new RobotFacade();
        rf2.constructRobot("yellow","steel");
        System.out.println("---FACADE PATTERN END---");
    }
}
