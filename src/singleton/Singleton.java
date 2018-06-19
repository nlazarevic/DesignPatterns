package singleton;

public class Singleton {

    private static Singleton instance;
    private Singleton(){

    };

    public static synchronized Singleton getInstance() {
        // LAZY INITIALIZATION
        if (instance == null){
            instance = new Singleton();
            System.out.println("Created new instance in singleton");
        } else {
            System.out.println("Instance already created");
        }

        return instance;
    }


    public static void setInstance(Singleton instance) {
        Singleton.instance = instance;
    }
}
