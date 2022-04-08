package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 100;

        if (n % 2 == 0){

            System.out.println("Even");//String
        }else{
            System.out.println("Odd");//String
        }
        System.out.println("-------------------------------");

        String result1 = (n % 2 == 0)? "Even" : "Odd";
        System.out.println(result1);

        System.out.println("-------------------------------");

        int age = 17;

         if(age>= 23){
            System.out.println("Eligible");//String==> same data type
        }else{
            System.out.println("Not Eligible");//String ==> same data type
        }

        System.out.println("-------------------------------");
       // System.out.println((age>= 23)? "Eligible" : "Not eligible");
        String result2 = (age>= 23)? "Eligible" : "Not eligible";

        System.out.println(result2);

        System.out.println("---------------------------");


        int number = 100;

        /*if(number > 0){
            System.out.println("positive");
        }else if(number< 0){
            System.out.println("negative");
        }else {
            System.out.println("zero");
        }*/
        System.out.println("-------------------------------");

        String result3 = (number> 1)? "positive" :(number<0)? "negative" : "zero";
        System.out.println(result3);












    }
}
