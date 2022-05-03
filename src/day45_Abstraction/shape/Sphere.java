package day45_Abstraction.shape;

public class Sphere extends Shape implements Volume{

    private double radius;
    public final static double  pi = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Sphere(String name, double radius) {
        super(name);
        setRadius(radius);

    }

        public double area(){

        return 4*pi*radius*radius;
        }

        public  double perimeter(){

            return 2*pi*radius*radius;
        }

       public double volume(){

        return 4/3 * pi * radius * radius;

        }


    @Override
    public String toString() {
        return "Sphere{" +
                super.toString() +
                ", radius='" + radius + '\'' +
                ", volume='" + volume() + '\'' +
                '}';
    }
}

