package utilities;

public class SleepMethod {

    public static void sleep(double seconds) {//We use static method because we'll use our method just within the class
        //Every time if we use sleep method we will have to handle exception. So, we created costom class to not to handle the exception for each time

        try {
            Thread.sleep((long) (seconds * 1000));//We are converting milisecond to second and sleep method parameter must be long
            //Thats why we explicitly convert double into long primitive data type
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}