package day38_Inheritance.shapeTask;

public class Circle extends Shape{

    public double radius;
    public static double pi = 3.14;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double area(){

        return pi * radius * radius;
    }

    public double perimeter(){

        return 2 * radius * pi;

    }
    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", pi='" +pi + '\'' +
                ", area of circle ='" + area() + '\'' +
                ", perimeter of circle ='" + perimeter() + '\'' +
                '}';
    }
}

/* r ,pi
toString : name, r, pi,area,perimeter
 */