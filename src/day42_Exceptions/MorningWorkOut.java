package day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("------------Push up started---------------------");

        for (int i = 1; i <= 30; i++) {

            System.out.print("\r Push up " + i);// \r use the next code in the same line

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println("\n----------------Push up completed-----------------------");

        System.out.println("------------Pull up started----------");

        for (int i = 1; i <=20 ; i++) {

            System.out.print("\r Pull up " + i);

           sleep(2.5);

        }

        System.out.println("\n-----------Pull ups completed----------");
    }

    public static void sleep(double seconds){//We use static method because we'll use our method just within the class
        //Every time if we use sleep method we will have to handle exception. So, we created costom class to not to handle the exception for each time

        try {
            Thread.sleep((long) (seconds * 1000));//We are converting milisecond to second and sleep method parameter must be long
            //Thats why we explicitly convert double into long primitive data type
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
/*
MorningWorkOut:
			1. Do 30 push-ups and try pausing 1.5 seconds in each
			2. Do 20 Pull-ups and try pausing 2.5 seconds in each
 */