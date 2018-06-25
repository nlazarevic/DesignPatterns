package adapter;

public class CalculatorAdapter {
    Calculator calculator;
    Triangle triangle;

    public double getArea(Triangle t){
        calculator = new Calculator();
        triangle = t;
        Rectangle r = new Rectangle();
        // area of triangle is 0.5 * base * height
        r.l = triangle.b;
        r.w = triangle.h * 0.5;

        return calculator.getArea(r);
    }
}
