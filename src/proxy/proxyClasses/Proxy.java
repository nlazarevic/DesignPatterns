package proxy.proxyClasses;

import proxy.originalClasses.ConcreteSubject;
import proxy.originalClasses.Subject;

public class Proxy extends Subject {

    ConcreteSubject cs;

    @Override
    public void doSomework() {
        System.out.println("Proxy call happening now");
        //Lazy initialization
        if (cs == null)
            cs = new ConcreteSubject();

        cs.doSomework();
    }
}
