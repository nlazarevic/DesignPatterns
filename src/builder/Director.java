package builder;

public class Director {

    BuilderInterface myBuilder;

    public void construct(BuilderInterface builder){
        myBuilder = builder;
        myBuilder.builderBody();
        myBuilder.insertWheels();
        myBuilder.addHeadLights();
    }
}
