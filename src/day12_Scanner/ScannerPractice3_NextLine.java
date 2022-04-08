package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");//Wooden Spoon Enter
        String fullName = input.nextLine();//Wooden Spoon +enter = It reads everything till hit the enter

        System.out.println("Enter your programming language");//Java Programming Language Enter
        String programming = input.nextLine();

        System.out.println("Enter your age");
        int age = input.nextInt();//24 ignore the enter thats why enter is kept in Scanner memory
        input.nextLine();// Makes Scanner empty- takes out the "enter" from the Scanner. Otherwise we cannot print school name
                        // capture the enter key that user pressed for nextInt()
        System.out.println("Enter your school name");
        String schoolName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        input.close();
    }
}
/*
After using other methods (nextInt(), nextDouble etc) if we use nextLine method we have to take out enter key from the
Scanner. Otherwise this enter key will be executed by default
All the other methods except "nextLine()" ignore the enter key and leave it to the Scanner so that using it for the next command
We have to clear out Scanner's memory by using input.nextLine();
                                               scan.nextLine();

 */