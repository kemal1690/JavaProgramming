package day47_PolyMorphism;

import day43_Abstraction.employee.*;
import day44_Abstraction.animal.Animal;
import day44_Abstraction.animal.Cat;
import day44_Abstraction.animal.Dog;
import day45_Abstraction.browserTask.ChromeDriver;
import day45_Abstraction.browserTask.WebDriver;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;
import org.w3c.dom.ls.LSOutput;

public class ReferenceTypeCastings {

    public static void main(String[] args) {


       // new Circle(4);//The reference type of this object type by default is Circle

      //  Shape shape =   (Shape) new Circle(4);//upcasting is done implicitly-->casting sub-type to the super type
        //No need to write (Shape) because compiler does it implicitly

        Shape shape2 = new Circle(5);//upcasting
        //Object type is the child of the reference type

        //WebDriver driver = (WebDriver) new ChromeDriver();

       // Dog dog2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        //Dog dog3 = dog2;

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");


         //Dog dog = (Dog)animal; // downcasting-We can use that for the different variables and different reference
                                    //type more than once
        //dog.bark();
        //animal.bark(); compile error
        //((Dog) animal).bark();//If we dont need more than one variable we use that



        System.out.println( animal.getName() );//Max
       // System.out.println( dog.getName() );//Max


        Shape shape1 = new Square(5);

        System.out.println(((Square) shape1).getSide());


        System.out.println("--------------------------------------------------");


        Animal animal2 = new Cat("Jim", "Scotish", 'M', 3, "Small", "White");

        //Cat cat = (Cat) animal2; //if we wanna use cat variable more than once we use this
        //cat.meow();

        ( (Cat) animal2 ).meow();//We use that just once

        // ( (Dog) animal2 ).bark(); -->>ClassCastException

        System.out.println("----------------------------------");

        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);

        //Tester tester = (Tester) employee;
        // tester.bugReport();
        //employee.work();

       ( (Tester) employee).bugReport();

       // ( (Tester) employee).unitTest(); compile error

        //( (Developer)employee ).unitTest();ClassCastException
        //Because there must be Is a relation between the new reference type and the object type
        //In that case our new reference is Developer and our reference type is Tester, so there is no relation between them

        // Driver driver = (Driver) employee;  // line 1 ClassCastException-there is no is a relation
        Person person = (Person) employee; // line 2 no problem we can do that
        //    Teacher teacher = (Teacher) employee; // line 3 ClassCastException-there is no is a relation

        System.out.println("--------------------------------------------");

        Shape s1 = new Circle(3);
        s1.area();//gives the overridden method from object class
        s1.perimeter();//gives the overridden method from object class
        //If method is not overridden, it will call parent/super class version
        System.out.println("s1.getName() = " + s1.getName());//Circle

        System.out.println(s1.perimeter());//gives the Circle perimeter.
        //Object type decides which implementation of the method will be executed

       Circle circle = (Circle)s1; //- No problem

        System.out.println(circle.area());//  - No problem

       // circle.perimeter();  - No problem
      //  System.out.println(((Circle) s1).area()); - No problem

        //  ( (Cube)s1 ).volume();ClassCastException


    }
}
