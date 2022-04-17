package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test1 started");

        try {//during the compile time try block can handle
            System.out.println(9 / 0);

            System.out.println("Try Block");

        }catch(ArithmeticException e){//e stands for the object that occured in try block, e can be any name
            //during the runtime catch block cna handle it

            System.out.println("Catch Block");
            System.out.println("ArithmeticException was occured");
        }


        System.out.println("Test1 Completed");

        System.out.println("------------------------------");

        System.out.println("Test2 started");

        int[] numbers = {1,2,3,4,5};

        try {
            System.out.println(numbers[200]);

            System.out.println("Try Block");
        }catch(RuntimeException e){//e contains the exception object

         //  e.printStackTrace();

            //System.out.println(e.getMessage());
        }

        System.out.println("Test2 Completed");

        System.out.println("---------------------------------------------------");

        System.out.println("Test3 started");

        try {
            System.out.println("Cydeo".substring(2, 0));
        }catch(RuntimeException e){

          //  e.printStackTrace();//this is optional to see the exception explanatio

        }
        System.out.println("Test3 Completed");

        System.out.println("--------------------------------------------------");


        System.out.println("Hello");


        try {
            Thread.sleep(3000); //before try block the sleep is underlined with red color
            //Exception is caught during the try block ==> Checked Exception
        } catch (InterruptedException e) { //compiler shows us the exception name
            e.printStackTrace();
        }

        System.out.println("Cydeo");//After 3 seconds it prints Cydeo


        System.out.println("------------------------------------------");


        try {

            FileInputStream file = new FileInputStream("File path");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
