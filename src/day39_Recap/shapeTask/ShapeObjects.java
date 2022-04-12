package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(10);// We cant give negative number because Square class we used condition
        //within setSide method

        //if System.exit(status:0) means nothing went wrong

        //square.side = -100;
        square.setSide(15);//if the access modifier was public we wouldn't have set restriction

        System.out.println(square);

        System.out.println(square.getName());

        System.out.println("--------------------------------");

        Rectangle rectangle = new Rectangle(5,6);

        System.out.println(rectangle);

        rectangle.setWidth(10);

        System.out.println(rectangle);

        System.out.println(rectangle.getWidth());

        System.out.println(rectangle.getName());

        System.out.println("----------------------------------");

        Circle circle = new Circle(7.5);

        System.out.println(circle);

        circle.setRadius(15.5);

        System.out.println(circle.getRadius());

        System.out.println(circle.getName());







    }
}
