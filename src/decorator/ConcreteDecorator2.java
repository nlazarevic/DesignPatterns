package decorator;

public class ConcreteDecorator2 extends AbstractDecorator {
    public void doJob(){
        System.out.println("");
        System.out.println("***START CONCRETE DECORATOR 2***");
        super.doJob();
        //Add adition thing if necessary
        System.out.println("Explicit command from ConcreteDecorator2");
        System.out.println("***END CONCRETE DECORATOR 2***");
    }
}
