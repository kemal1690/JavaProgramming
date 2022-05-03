package day45_Abstraction.shape;

public class Triangle extends Shape{

    private double radius;

    public final static double pi = 3.14;


    public Triangle( double radius) {
        super("Triangle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

        if(radius<=0){

            throw new RuntimeException("Invalid radius: " + radius);
        }
        this.radius = radius;
    }


    public double area(){

        return pi * radius * radius;
    }

    public double perimeter(){

        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                super.toString() +
                ", radius='" + radius + '\'' +
                '}';
    }
}
