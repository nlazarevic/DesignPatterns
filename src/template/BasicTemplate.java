package template;

public abstract class BasicTemplate {
    
    public void Basic(){
        basicMethod1();
        basicMethod2();
        
        //specialized methods
        specializedMethod();
    }

    //abstract method must be implemented in derived classes
    public abstract void specializedMethod();

    // non-abstract method, implemented in BasicTemplate class
    private void basicMethod2() {
        System.out.println("Basic method 2");
    }

    // non-abstract method, implemented in BasicTemplate class
    private void basicMethod1() {
        System.out.println("Basic method 1");
    }
}
