package adapter;
// calculator can calculate the area of a rectangle
public class Calculator {
    Rectangle rectangle;

    public double getArea(Rectangle r){
        rectangle = r;

        return rectangle.l * rectangle.w;
    }
}
