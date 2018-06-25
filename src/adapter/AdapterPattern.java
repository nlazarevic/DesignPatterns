package adapter;

public class AdapterPattern {
    public static void main(String[] args){
        System.out.println("---ADAPTER PATTERN");
        CalculatorAdapter ca = new CalculatorAdapter();
        Triangle t = new Triangle(10,5);
        System.out.println("Area of triangle is " + ca.getArea(t));
        System.out.println("---END OF ADAPTER PATTERN");
    }
}
