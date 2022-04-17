package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {


        //unchecked exception: occurs during the runtime, not compile time

        int a = 10;
        int b = 0;

        // System.out.println(  a / b  ); Occured during the runtime so it is unchecked excepiton
        //System.out.println("Wooden Spoon");//We cannot continue our writing code, because occured exception
                                            // can crash our program


        char[] characters = {'A', 'B', 'C'};
        //                    0,   1,   2

        //  System.out.println( characters[99] );first compiler execute then check it

        Student student = null; //null means object doesnt exist,

       // System.out.println(student.getName());//compile doesnt know. thats why after running it gives nullPointerException

        //student.study();

        String str = "Wooden Spoon";

         //str = null;

         // System.out.println( str.toUpperCase() );//java.lang.NullPointerException

        String str2 = ""; // object != null
        System.out.println(str2.isEmpty());


        //checked Exception:occurs during the compile time while you're writing the code and compiler tells us

        System.out.println("Hello");

       // Thread.sleep(3000);

        System.out.println("Cydeo");


        // FileInputStream file = new FileInputStream("path of the file");

        System.out.println("Java".charAt(1000)); // unchecked exception -compiler doesnt know









    }
}
