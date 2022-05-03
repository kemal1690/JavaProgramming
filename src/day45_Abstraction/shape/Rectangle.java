package day45_Abstraction.shape;

public class Rectangle extends Shape{

    private double width;

    private double length;

    public Rectangle( double width, double length) {
        super("Rectangle");
       setWidth(width);
       setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString() +
                ", width='" + width + '\'' +
                ", length='" + length + '\'' +
                '}';
    }
}
