package singleton;

public class SingletonPattern {
    public static void main(String[] args){
        System.out.println("---Singleton pattern(lazy initialization with synchronized keyword)---");
        System.out.println("Getting singleton instance");
        Singleton s1 = Singleton.getInstance();
        System.out.println("Getting another singleton instance");
        Singleton s2 = Singleton.getInstance();
        if(s1 == s2)
            System.out.println("s1 and s2 are same instance");
    }
}
