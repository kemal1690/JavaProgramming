package day39_Recap.shapeTask;

public class Circle extends Shape{

    private double radius;
    public static double pi = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){

            System.out.println("Invalid radius: " + radius);
            System.exit(1);
        }
        this.radius = radius;
    }


    public Circle(double radius) {
        super("Circle");//We know the name so, we can directly assign a value
        setRadius(radius);
    }

    public double area(){

        return radius * radius * pi;
    }

    public double perimeter(){

        return 2*radius * pi;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi='" + pi + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
Circle extends Shape:
		variables:
			radius
			pi (static)
		Encapsulate the field
		Add a constructor to set the filed
		area(): radius * radius * pi
		perimeter(): 2 * radius * pi
		toString(): r, pi, area, perimeter
 */