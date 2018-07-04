package builder;

public class Motorcycle implements BuilderInterface {

    private Product product = new Product();

    @Override
    public void builderBody() {
        product.add("This is body of a motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("1 headlight is added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
