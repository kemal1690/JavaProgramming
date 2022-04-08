package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {


    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");//John Smith
        String fullName = scan.nextLine();

        System.out.println("Enter your building number");//7925A
        String building = scan.next();
        scan.nextLine();//Enter

        System.out.println("Enter your street name");//Johnes Branch Drive
        String streetName = scan.nextLine();

        System.out.println("Enter your city name");//McLean Enter
        String cityName = scan.nextLine();

        System.out.println("Enter your state");//VA Enter
        String state = scan.next();

        System.out.println("Enter your Zip code");
        String zipCode = scan.next();//22012
        scan.nextLine();

        System.out.println("Enter your country name");
        String country = scan.nextLine();

     String adress = fullName + "\n" + building + " " + streetName + "\n" + cityName + ", " + state + " " + zipCode;
     System.out.println(adress);

      scan.close();















    }
}
/*
1. Enter your full name ( nextLine() )
2. Enter your building number ( next() )
3. Enter your Street name ( nextLine() )
4. Enter your city name ( nextLine() )
5. Enter your state ( nextLine() )
6. Enter your zip code ( next() )
Display the shipping address
John Smith
7925 Jones Branch Dr
McLean, VA 22012
 */