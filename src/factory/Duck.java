package factory;

public class Duck implements AnimalInterface {
    @Override
    public void speak() {
        System.out.println("Duck says quack quack");
    }
}
