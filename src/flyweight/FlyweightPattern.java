package flyweight;

public class FlyweightPattern {
    public static void main(String[] args) throws Exception {
        System.out.println("---FLYWEIGHT PATTERN---");

        RobotFactory myFactory = new RobotFactory();
        RobotInterface shape = myFactory.getRobotFromFactory("small");
        shape.print();

        for (int i = 0; i < 2; i++){
            shape = myFactory.getRobotFromFactory("small");
            shape.print();
        }
        int numOfDistinctRobots = myFactory.totalObjectCreated();
        System.out.println("\n Distinct robot object created till now=" + numOfDistinctRobots);

        for (int i = 0; i < 5; i++){
            shape = myFactory.getRobotFromFactory("large");
            shape.print();
        }
        numOfDistinctRobots = myFactory.totalObjectCreated();
        System.out.println("\n Finally no of distinct robot object created:" + numOfDistinctRobots);

        System.out.println("---END OF FLYWEIGHT PATTERN---");
    }
}
