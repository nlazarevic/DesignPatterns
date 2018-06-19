package proxy;

import proxy.proxyClasses.Proxy;

public class ProxyPattern {
    public static void main(String[] args){
        System.out.println("---Proxy pattern---");
        Proxy px = new Proxy();
        px.doSomework();
    }
}
