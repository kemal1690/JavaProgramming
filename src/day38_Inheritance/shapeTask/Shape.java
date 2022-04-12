package day38_Inheritance.shapeTask;

public class Shape {

    public String name;

    public Shape(String name) {
        this.name = name;
    }

    public double area(){

        return 0;
    }

    public double perimeter(){

        return 0;
    }

    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
variable:name,
Add a constructor to set the field

Methods()
area() returns 0,
perimeter returns 0,
toString() name,  area,perimeter

 */