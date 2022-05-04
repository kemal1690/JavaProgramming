package day45_Abstraction.shape;

public class ShapeObjects {

    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder("Cylinder",2,2);
        Cube cube = new Cube("Cube",2);
        Sphere sphere = new Sphere("Sphere",2);
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(2);
        Rectangle rectangle = new Rectangle(2,2);

        System.out.println("cylinder = " + cylinder);
        System.out.println("cube = " + cube);
        System.out.println("sphere = " + sphere);
        System.out.println("circle = " + circle);
        System.out.println("triangle = " + triangle);
        System.out.println("rectangle = " + rectangle);

            cylinder.setHeight(4);
            rectangle.setLength(3);
            circle.setRadius(4);
            cube.setSide(4);
            triangle.setRadius(5);
            //cube.drink();

        System.out.println("triangle radius: " + triangle.getRadius());
        System.out.println("cube side = " + cube.getSide());
        System.out.println("rectangle.area() = " + rectangle.area());

        System.out.println(cylinder.hasVolume);
        System.out.println(cube.volume());













    }











}
