package day04_Variables;

public class Rectangle {

    public static void main(String[] args) {

        /* Create a class named Rectangle, write a program that can calculate
        the area and the perimeter of any give square side

        area = length * width
        perimeter = 2 * (length + width)
        */

        double length = 5.5;
        double width = 10.5;
        double area = length * width;
        double perimeter = 2 * (length + width);


        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}
/* double = DataType
length/width/area/perimeter: Variables that contain Data
Data: piece of information
 */