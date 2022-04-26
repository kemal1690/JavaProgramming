package day43_Abstraction.shape;

public class Circle extends Shape {


    private double radius;
    public final double pi = 3.14;

    public Circle(String name, double radius) {
        super(name);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

        if(radius<=0) {
            throw new RuntimeException("Invalid radius: " + radius);
        }
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }


    public double area(){

        return pi * radius * radius;
    }

    public double perimeter(){

        return 2 * pi * radius;
    }

}
