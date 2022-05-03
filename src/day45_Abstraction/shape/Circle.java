package day45_Abstraction.shape;

public class Circle extends Shape{

     public final static double pi = 3.14;
     private double radius;

    public Circle( double radius) { //(double name, double radius) ==> name is unnecessary, we can give a name
        super("Circle");
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

    @Override
    public double area() {
        return pi * radius * radius;
    }

    public double perimeter(){

        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString() + //We are calling parent class toString() method
                "radius=" + radius +
                '}';
    }
}
