package decorator;

public class DecoratorPattern {
    public static void main(String[] args){
        System.out.println("---DECORATOR PATTERN---");
        ConcreteComponent cc = new ConcreteComponent();

        ConcreteDecorator1 cd1 = new ConcreteDecorator1();
        //Decorating ConcreteComponent object with ConcreteDecorator1
        cd1.setTheComponent(cc);
        cd1.doJob();

        ConcreteDecorator2 cd2 = new ConcreteDecorator2();
        //Decorating ConcreteComponent object with ConcreteDecorator1 and ConcreteDecorator2
        cd2.setTheComponent(cd1);
        cd2.doJob();
    }
}
