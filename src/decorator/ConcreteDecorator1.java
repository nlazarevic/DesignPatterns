package decorator;

public class ConcreteDecorator1 extends AbstractDecorator {
    public void doJob(){
        super.doJob();
        //Add adition thing if necessary
        System.out.println("Explicit command from ConcreteDecorator1");
    }
}
