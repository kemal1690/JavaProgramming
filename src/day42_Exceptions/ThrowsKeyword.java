package day42_Exceptions;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {
        /*
        We can throws any exception
        To handle this checked exception there are 2 different compile errors.If we use try catch block over and over.For example
        we can confront 20 errors like that. Thats why using 'throws' keyword will handle them
         */

        System.out.println("-------- Test 1------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Cydeo");

        System.out.println("-------- Test 1 Completed------------");


        System.out.println("-------- Test 2------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Batch 25");

        System.out.println("-------- Test 2 Completed------------");













    }
}
