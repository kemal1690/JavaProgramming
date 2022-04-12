package day38_Inheritance.shapeTask;

public class Rectangle extends Shape{

    public double length, width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double area(){

        return width * length;
    }

    public double perimeter(){

        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ",length=" + length +
                ",width=" + width +
                ",area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
//length,width
//toString : name, length, width,area,perimeter