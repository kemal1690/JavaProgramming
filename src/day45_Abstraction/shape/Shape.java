package day45_Abstraction.shape;

public abstract class Shape {


    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {                          //if we dont override toString() method in subclasses we can get
                                                        //sub clasess names by using the code below
             return                                     // getClass().getSimpleName() + "{" +
                        "name='" + name + '\'' +
                        ", area='" + area() + '\'' +
                        ", perimeter='" + perimeter() + '\'';

    }

}
