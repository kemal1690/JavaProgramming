package day08_IfStatement;

public class NumberOfDays {
    public static void main(String[] args) {

        int number = 5;// this can be any number between 1-12 (month number)

        boolean has28Days = number == 2; //February
        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;
        //number = number of the months
        boolean has31Days = !has28Days && !has30Days;// if the month does not have 28 days AND does not have 30 days

        if(has28Days){// if the month has 28 days
            System.out.println("28 days");
        }

        if(has30Days){// if the month has 30 days
            System.out.println("30 days");
        }

        if(has31Days){ // if the month has 31 days
            System.out.println("31 days");
        }
    /*
        if(number >=1 && number <=12) {

            switch (number) {
                case 2:
                    System.out.println("28 days");
                    break;
                case 4: case 6: case 9: case 11:
                    System.out.println("30 days");
                    break;
                default:
                    System.out.println("31 Days");

            }

        }else{
            System.out.println("Invalid number");
        }

*/


    }
}
/* 3. Create a class called NumberOfDays, Write a program that can print the number of days in a month
        Ex:
        number = 1;
        output:
        31 Days
        Hints:
        Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
        Months that has 30 days: 4, 6, 9, 11
        Month that has 28 days: 2
        */