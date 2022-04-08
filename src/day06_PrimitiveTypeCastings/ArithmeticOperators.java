package day06_PrimitiveTypeCastings;

import java.sql.SQLOutput;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("12" + 1); // 121, Concatenation
        System.out.println(10 + 20); // 30 Addition
        System.out.println(100 - 50); // 50 Subtraction
        System.out.println(10 * 5); // 50 Multiplication

        System.out.println(100 / 3); //33
        System.out.println(10.0 / 4); // 2.5
        System.out.println(10 / 4.0); // 2.5
        System.out.println(10d / 4); // 2.5
        System.out.println(10 / 4d); // 2.5

        int a = 100;
        double b = a/6; // 16.0 ==> Because a= integer, 6 = integer so the result must be integer
        double c = a/6.0; // 16.66666
        //double c = (double)a/6;  16.66666 (same)
        // double c = a/6d;        16.66666 (same)

        System.out.println(b);
        System.out.println(c);

        System.out.println(100D);








    }



}
/* Addition  : +
   Subtract  : -
   Division  : /
   Multiplication : *
   Remainder : %

   In math
        10/4 : 2.5

   In Java
        10/4 : 2
        10.0/4: 2.5  We have to add "0" to numerator or denominator


    */