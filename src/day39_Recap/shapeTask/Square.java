package day39_Recap.shapeTask;

public class Square extends Shape {

    private double side;


    public double getSide() {
        return side;
    }

    public void setSide(double side) {

        if(side<=0){

            System.out.println("Invalide side: " + side);
            System.exit(1);
        }
        this.side = side;
    }

    public Square(double side) {
        super("Square");
        setSide(side);//setter can also check the requirement, if the user input negative number
        //thanks to setter it checks the requirement that is written setSide method
    }

    public double area(){

        return side * side;
    }

    public double perimeter(){

        return 4* side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}

/*
Square extends Shape:
	variables:
		side;
	Encapsulate the field
	Add a constructor to set the filed
	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */