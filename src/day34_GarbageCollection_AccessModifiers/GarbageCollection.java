package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_Constructors.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {
/*
        int n = null; we cannot assign null for primitive data types
        String str = null;//null is default value of all non-primitive data types

        System.out.println(str.toUpperCase());//NullPointerException means no object has been created
 */

        String str = "Wooden Spoon"; // after line 13, "Wooden Spoon" will be eligible for garbage collection
        str = null;

        System.out.println( str );//null

        Car car1 = new Car("Toyota");

        car1 = null;

        System.out.println(car1);

        Dog dog1 = new Dog();

        dog1.name = "Lucy";

        dog1 = new Dog();
        dog1.name = "Max";

        System.out.println(dog1);

        String language = "Python";//Python is unreferenced after line 36, so it is eligible for garbage collection
        language    =   "Java";

        System.out.println(language);

        System.out.println("-----------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1 ;

        list2.addAll(Arrays.asList(200, 300, 400));

        System.out.println(list1);//[100, 200, 300, 400]
        System.out.println(list2);//[100, 200, 300, 400]

        System.out.println(list1 == list2 );//true

        System.out.println("-----------------------------------");

        Student student1 = new Student("Tahir", 30, 'M', 'B', 14);
        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Ahmet";//We have one object from the student class, thats why we can not store both
        //"Ahmet" and "Tahir". student1 and student2 they're referencing the same object

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("------------------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = l1;//referencing the same object
        l2.add("Python");


        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);












    }
}
