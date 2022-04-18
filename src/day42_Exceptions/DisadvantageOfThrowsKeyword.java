package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {
    public static void main(String[] args) {

        System.out.println("Hello");

       // sleep(2.5);it gives compile error because we have to use throws keyword with
        // the exception name (throws InterruptedException) again in the main method to handle it


        System.out.println("Hello World");

        System.out.println("-------------------------");

        MorningWorkOut.sleep(2.5); // it doesnt give compile error, because we created sleep method by using
        //try and catch method

        System.out.println("Cydeo");



    }


    public static void sleep(double seconds) throws InterruptedException{

        Thread.sleep((long) (seconds * 1000));
    }









}
