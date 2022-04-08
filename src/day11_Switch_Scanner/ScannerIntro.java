package day11_Switch_Scanner;


import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in); //in = input
        /*
      input. nextInt();

        System.out.println( input. nextInt()); // 100 200 200
        */

        System.out.println("Enter an integer: ");
        int num1 = input. nextInt(); //We use variable to make it reusable

        System.out.println("Enter a decimal");
        double num2 = input.nextDouble();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication :" + (num1*num2));

        input.close(); // closes the scanner, if not intelij gets slow and you can not use the scanner anymore


        /*System.out.println("Enter an integer");
        int num3 = input.nextInt();
        System.out.println(num3);

         */




    }
}
