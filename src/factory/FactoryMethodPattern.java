package factory;

public class FactoryMethodPattern {
    public static void main(String[] args) throws Exception {
        System.out.println("---FACTORY METHOD PATTERN---");

        AnimalInterfaceFactory animalFactory = new ConcreteFactory();
        AnimalInterface duckType = animalFactory.getAnimalType("Duck");
        duckType.speak();
        AnimalInterface tigerType = animalFactory.getAnimalType("Tiger");
        tigerType.speak();

        // throws the exception
        AnimalInterface lionType = animalFactory.getAnimalType("Lion");
        lionType.speak();

        System.out.println("---END OF FACTORY METHOD PATTERN---");
    }
}
