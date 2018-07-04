package builder;

public class BuilderPattern {
    public static void main(String[] args){
        System.out.println("---BUILDER PATTERN---");

        Director director = new Director();

        BuilderInterface carBuilder = new Car();
        BuilderInterface motorcycleBuilder = new Motorcycle();

        director.construct(carBuilder);
        Product p1 = carBuilder.getVehicle();
        p1.show();

        director.construct(motorcycleBuilder);
        Product p2 = motorcycleBuilder.getVehicle();
        p2.show();

        System.out.println("---END OF BUILDER PATTERN---");
    }
}
