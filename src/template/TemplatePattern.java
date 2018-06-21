package template;

public class TemplatePattern {
    public static void main(String[] args){
        System.out.println("---TEMPLATE PATTERN---");
        BasicTemplate bs = new SpecializedClass1();
        System.out.println("Specialized Class 1 methods:");
        bs.Basic();
        System.out.println();
        bs = new SpecializedClass2();
        System.out.println("Specialized Class 2 methods:");
        bs.Basic();
    }
}
