package decorator;

public class ConcreteComponent extends AbstractComponent {
    @Override
    public void doJob() {
        System.out.println("In concrete component - closed for modification");
    }
}
