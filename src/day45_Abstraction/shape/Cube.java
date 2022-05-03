package day45_Abstraction.shape;

public class Cube extends Shape implements Volume{

    private double side;

    public Cube(String name, double side) {
        super(name);
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {

        if(side<=0){

            throw new RuntimeException("Invalid side: " + side);
        }
        this.side = side;
    }


    public double area(){

        return 4 * side * side;
    }

    public double perimeter(){

        return 12 * side;
    }

    public double volume(){

        return side * side *side;
    }



    @Override
    public String toString() {
        return "Cube{" +
                super.toString() + '\'' +
                ", side='" + side + '\'' +
                ", volume='" + volume() + '\'' +
                '}';
    }
}

