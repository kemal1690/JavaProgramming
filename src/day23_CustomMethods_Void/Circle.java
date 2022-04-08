package day23_CustomMethods_Void;

public class Circle {
    public static void main(String[] args) {

        areaOfCircle(3.0);
    }

    public static void areaOfCircle(double radius){

       double area = radius * radius * 3.14;

        System.out.println("area : "+ area);
    }


}
/*
6. create a method that can calculate the area of a circle
 */

/* Calculate square
 public static void areaOfSquare(double side){
        double area = side * side;
        System.out.println("area = " + area);
    }
 */