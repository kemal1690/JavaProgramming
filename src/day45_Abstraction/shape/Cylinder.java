package day45_Abstraction.shape;

public class Cylinder extends Shape implements Volume{

    private double radius;
    private double height;
    public final static double pi = 3.14;

    public Cylinder(String name, double radius, double height) {
        super(name);
        this.radius = radius;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {

        if(height<=0){

            throw new RuntimeException("Invalid height: " + height);
        }
        this.height = height;
    }

    public double area(){

        return (2*pi*radius * radius) + height * (2*pi*radius);
    }

    public double perimeter(){

        return (4 * pi *radius) + (4*pi*radius + height);
    }

    public double volume(){

        return pi * radius * radius * height;
    }


    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString() + '\'' +
                ", radius='" + radius + '\'' +
                ", height='" + height + '\'' +
                ", volume='" + volume() + '\'' +
                '}';
    }
}
