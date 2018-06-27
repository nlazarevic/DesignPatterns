package factory;

public abstract class AnimalInterfaceFactory {
    public abstract AnimalInterface getAnimalType(String type) throws Exception;
}
