package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age : 38 years old

        byte age = 38;

        // weight : 160 pounds

        // byte weight = 160 is out of byte's range

        short weight = 160; // 160 is within the range of short

        // salary : 100000 $

        // short salary = 100000; 100000 is out of short's range

        int salary = 100_000; // preferred data type for integer numbers

        long asset = 3_333_333_333L;

        // tax :0.26

        float tax = 0.26F;

        double PI = 0.26;


    char ch1 = '#';
        System.out.println("ch1 = " + ch1);


        char ch2 = 35; //Ascii table
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000; //Ascii table
        System.out.println("ch3 = " + ch3);

        char gender = 'F';
        char grade = 'F';
        char yesNo = 'Y';

        System.out.println(yesNo);

        boolean isEmployeed = true;
        boolean isMarried = false;

        boolean result = 100 > 300;

        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        String city = "MsLean";
        String state = "Virginia";
        String country = "USA";

        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("country = " + country);

        String first_name$ = "Ali"; /* just _ (underscore)or $ characters can be given
        as a variable character */
        System.out.println(first_name$);

        int num1 = 100;
        int num2 = 200;

        // int private = 300; (Note: We cannot give Java reserved words as a variable name)




    }



}
