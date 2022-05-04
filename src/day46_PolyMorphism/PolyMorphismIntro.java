package day46_PolyMorphism;

import day43_Abstraction.employee.*;
import day44_Abstraction.animal.Animal;
import day44_Abstraction.animal.Cat;
import day45_Abstraction.shape.*;

import java.util.ArrayList;

public class PolyMorphismIntro {

    public static void main(String[] args) {

    String str = "Wooden Spoon";

    Integer n1 = 2;
    Double b2 = 5.5;
    Boolean r1 = true;

    Object[] array = {str,n1,b2,r1,new Circle(4),new Square(7)};
    //Object is a parent for all of them


    /*
            WebDriver driver;
            driver = new ChromeDriver();
            driver = new FireFoxDriver();
         */

        Employee tester = new Tester("Ali",30,'M',42,"SDET",145000.00);
        Employee developer = new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        Employee teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        Employee driver = new Driver("Jhon",34,'M',42,"Lyft Driver",75000.00);

        ArrayList<Person> cydeoEmployees = new ArrayList();//Reference Type/Data type can also be Employee
        //Arraylisy<Employee> cydeoEmployees = new ArrayList();

        cydeoEmployees.add(tester);
        cydeoEmployees.add(developer);
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);


        System.out.println("-------------------------------------------");


        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);
        employee.work();//which method will be executed depends on the object type (Tester)
        // employee.bugReport(); we can not call methods that are not exist in Employee reference type/class
        //if the method is overridden, overridden version gets executed
        //if the method is not overridden, original verson(in parent class) gets executed


        /*
            WebDriver driver1 = new ChromeDriver();
            WebDriver driver2 = new ChromeDriver();
            driver1.get(amazon)
            driver2.get(google)

            Animal animal = new Dog();
            animal.drink()
            Animal animal = new Cat()
            animal.drink()
            Animal animal = new Tiger()
            animal.drink()
         */

        Animal animal3 = new Cat("Max", "Husky", 'M', 3, "Small", "White");

        Shape shape = new Circle(5);
        shape.area();//pi*radius*radius from Circle object type

        //System.out.println( shape.getRadius()); You cannot call because reference type is shape
       // System.out.println( shape.pi);

        boolean isSquare = shape instanceof Square;
        boolean isRectangle = shape instanceof Rectangle;
        boolean isTriangle = shape instanceof Triangle;
        boolean isCircle = shape instanceof Circle;


        System.out.println("isSquare = " + isSquare);
        System.out.println("isRectangle = " + isRectangle);
        System.out.println("isTriangle = " + isTriangle);
        System.out.println("isCircle = " + isCircle);


        /*
        WebDriver driver:
            if(driver instanceof Chrome){
                Chrome browser will open
            }else if(driver instanceof firefox){
                Firefox browser will open
            }
            ...
         */

    }
}
