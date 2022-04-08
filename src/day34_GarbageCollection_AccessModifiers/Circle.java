package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

public double radius;

public static double pi;//we can assign pi value directly, because it has just one step
public static String name;
public static ArrayList<Integer> numbers;//Values can not be set in one step,that's why we assign a new ArrayList object
    //within the static block


//public static Sheet sheet;

    public Circle(double radius) {
        this.radius = radius;
       // pi = 3.14; don't use static variable inside the constructor
    }

    static{

       // radius = 3.5; it gives compiler error, because static doesnt accept instance variables
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }
/*
if we need more than one step for the static variables, we need to use static block
     static method can be executed authomatically outside of the class, through calling class name
    for ex: System.out.println(Circle.pi);
            System.out.println(Circle.name);
            System.out.println(Circle.numbers);


 */




/*
main method cannot be executed authomatically outside the class
    public static void main(String[] args) {
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);
    }

 */















}
