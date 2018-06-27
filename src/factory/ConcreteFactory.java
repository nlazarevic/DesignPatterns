package factory;

public class ConcreteFactory extends AnimalInterfaceFactory {
    @Override
    public AnimalInterface getAnimalType(String type) throws Exception {
        switch (type){
            case "Duck": return new Duck();
            case "Tiger": return new Tiger();

            default: throw new Exception("Animal type: " + type + " cannot be instantiated");
        }
    }
}
